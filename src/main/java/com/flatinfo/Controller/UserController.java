package com.flatinfo.Controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.flatinfo.Entity.User.UserEntity;
import com.flatinfo.Service.SecurityServiceImpl;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

//@RestController
@Controller
@RequestMapping(value = "/user")
@SessionAttributes("user")
public class UserController {
	private DBCollection userCollection = MongodbConnection();
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(ModelMap model){
		//the return is the one who decide which views to parse on it
		return "user";
	}
	
	@RequestMapping(value="search/{address}", method=RequestMethod.GET)
	public String searchUser(ModelMap model, @PathVariable("address") String address){
		System.out.println("The address is "+address);
		return address;
	}
	
	//TODO try to group POST and GET in the same function
	@RequestMapping(value="login", method=RequestMethod.POST)
	//public ModelAndView login(@ModelAttribute("inputUser") String username, @ModelAttribute("inputpwd") String password){
	public ModelAndView login(ModelAndView mv, @ModelAttribute("user") UserEntity user, HttpSession session){
		System.out.println("username "+ user.getMail() + " password : "+user.getPassword());
		/*HttpSession session = new HttpSession();
		session.getServletContext();
		System.out.println("Session "+session);*/
		//ModelAndView mv = new ModelAndView();
		DBObject query = new BasicDBObject();
		if(user.getMail().indexOf('@') >= 0)	
			query.put("mail", user.getMail());
		else
			query.put("username", user.getMail());
		/*else {
			mv.addObject("ErrorMessage", "There is no Mail or username");
			return mv;
		}*/
		query.put("password", user.getPassword());
		DBCursor userCursor = userCollection.find(query);
		logger.debug("Query "+query);
		logger.debug("Count users "+userCursor.count());
		if(userCursor.count() == 0){
			mv.addObject("ErrorMessage","Username/Mail or Password is invalid");
			mv.setViewName("user/login");
			return mv;
		}
		mv.setViewName("user/profile");
		DBObject userDB = userCursor.next();
		session.setAttribute("user", user);
		//UserEntity user = mongoTemplate.getConverter().read(UserEntity.class, userCursor); 
		mv.addObject("user", userDB);
		return mv;
	}
	
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public ModelAndView login(ModelAndView mv, HttpSession session){
		if(session.getAttribute("user") == null) {
			mv.addObject("user", new UserEntity());
			mv.setViewName("user/login");
			return mv;
		}
		mv.setViewName("user/profile");
		return mv;
	}
	
	@RequestMapping(value="logout", method=RequestMethod.GET)
	public String logout(ModelAndView mv, HttpSession session){
		session.invalidate();
		session.removeAttribute("user");
        return "redirect:/";
	}
	
	@RequestMapping(value="signup", method=RequestMethod.GET)
	public ModelAndView signup(ModelAndView mv, HttpSession session){
		if(session.getAttribute("user") == null) {
			mv.addObject("user", new UserEntity());
			mv.setViewName("user/signup");			
			return mv;
		}
		mv.setViewName("user/profile");			
		return mv;
	}
	
	@RequestMapping(value="signup", method=RequestMethod.POST)
	public ModelAndView signup(ModelAndView mv, @ModelAttribute("user") UserEntity user, BindingResult result, HttpSession session){
		logger.debug("Signup Post : "+user.getPassword()+
				" F "+user.getFirstName()+" L "+user.getLastName()+ " M "+user.getMail() + " U "+user.getUsername());
		BasicDBObject userDBObject = userEntityToDBObject(user);
		try {
			userCollection.insert(userDBObject);
		}
		catch(Exception e) {
			mv.addObject("ErrorMessage","Username/Mail is already registred");
			mv.setViewName("user/signup");
			return mv;
		}
		//Cookie cookie = new Cookie("user", );
		//mv.addObject("user", new UserEntity());
		mv.addObject("user", user);
		mv.setViewName("user/profile");
		session.setAttribute("user", user);
		return mv;
	}
	
	@RequestMapping(value="/profile", method=RequestMethod.GET)
	public ModelAndView getProfile(ModelAndView mv, HttpSession session, BindingResult bindingResult, @RequestHeader(value = "referer", required = false) final String previousURL){
	    if (bindingResult.hasErrors()) {
	        //errors processing
	    }  
		if(session.getAttribute("user") == null) {
			mv.addObject("Message", "You need to log in to access to the specified page");
			logger.debug("previousURL : "+previousURL);
			mv.addObject("previousUrl", previousURL);
			mv.setViewName("user/login");	
			return mv;
		}
		mv.setViewName("user/profile");
		return mv;
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public ModelAndView editProfile(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/editProfile");
		/*BasicDBObject query = new BasicDBObject();
		query.put("username", user.getUsername());
		
		BasicDBObject userDBObject = userEntityToDBObject(user);
		
		try {
			userCollection.findAndModify(query, userDBObject);	
			return true;
		}
		catch (Exception e) {
			logger.debug("Excpetion accured"+e);
		}*/
		return mv;
	}
	
	@RequestMapping(value="/Users", method=RequestMethod.GET)
	public List<DBObject> getAllUsers(){
		DBCursor userCursor = userCollection.find();
		List<DBObject> users = null;
		while(userCursor.hasNext()){
			users.add(userCursor.next());
		}
		return users;
	}
	
	@RequestMapping(value="/Adduser", method=RequestMethod.POST)
	public boolean addUser(@RequestBody UserEntity user){
		BasicDBObject userDBObject = userEntityToDBObject(user);
		
		userCollection.insert(userDBObject);
		
		return true;
	}
	
	@RequestMapping(value="/EditUser")
	public boolean editUser(@RequestBody UserEntity user){
		
		BasicDBObject query = new BasicDBObject();
		query.put("username", user.getUsername());
		
		BasicDBObject userDBObject = userEntityToDBObject(user);
		
		try {
			userCollection.findAndModify(query, userDBObject);	
			return true;
		}
		catch (Exception e) {
			logger.debug("Excpetion accured"+e);
		}
		
		return false;
	}

	@SuppressWarnings("deprecation")
	private DBCollection MongodbConnection() {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("flat");
		DBCollection usercollection = db.getCollection("userCollection");
		usercollection.createIndex(new BasicDBObject("mail", 1), new BasicDBObject("unique", true));
		usercollection.createIndex(new BasicDBObject("username", 1), new BasicDBObject("unique", true));
		return usercollection;
	}
	
	public BasicDBObject userEntityToDBObject(UserEntity user){
		BasicDBObject userDBObject = new BasicDBObject();
		userDBObject.put("firstName", user.getFirstName());
		userDBObject.put("lastName", user.getLastName());
		userDBObject.put("mail", user.getMail());
		userDBObject.put("username", user.getUsername());
		//TODO Crypt the password
		userDBObject.put("password", user.getPassword());
		userDBObject.put("birthdate", user.getBirthdate());
		userDBObject.put("age", user.getAge());
		userDBObject.put("phone", user.getPhone());
		userDBObject.put("adresse", user.getAdresse());
		userDBObject.put("postalCode", user.getPostalCode());
		userDBObject.put("city", user.getCity());
		userDBObject.put("country", user.getCountry());
		userDBObject.put("lastConnection", user.getLastConnection());
		userDBObject.put("active", user.isActive());
		userDBObject.put("pictures", user.getPictures());
		userDBObject.put("flats", user.getFlats());
		userDBObject.put("stayingTime", user.getStayingTime());
		userDBObject.put("infoToShow", user.getInfoToShow());
		userDBObject.put("socialNetwork", user.getSocialNetwork());
		return userDBObject;
	}
}

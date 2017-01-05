package com.flatinfo.Controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

import com.flatinfo.Entity.Flat.FlatEntity;
import com.flatinfo.Entity.User.ShowInfo;
import com.flatinfo.Entity.User.SocialNetwork;
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
	
	//@Autowired
	//SecurityServiceImpl securityService;
	
	private DBCollection userCollection = MongodbConnection();
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(ModelMap model){
		//the return is the one who decide which views to parse on it
		return "user";
	}
	
	//TODO try to group POST and GET in the same function
	@RequestMapping(value="login", method=RequestMethod.POST)
	//public ModelAndView login(@ModelAttribute("inputUser") String username, @ModelAttribute("inputpwd") String password){
	public ModelAndView login(ModelAndView mv, @ModelAttribute("user") UserEntity user, BindingResult result, HttpSession session){
		if(result.hasErrors()){
			mv.addObject("ErrorMessage","There was a problem with your authentification");
			mv.setViewName("user/login");
			return mv;
		}
		System.out.println("username "+ user.getMail() + " password : "+user.getPassword());
		DBObject query = new BasicDBObject();
		if(user.getMail().indexOf('@') >= 0)	
			query.put("mail", user.getMail());
		else
			query.put("username", user.getMail());
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
		/*if(request.getParameter("remember-me") != null){
			logger.debug("From here");
			Cookie ckUsername = new Cookie("username", (String)userDB.get("username"));
			ckUsername.setMaxAge(3600);
			response.addCookie(ckUsername);
			Cookie ckMail = new Cookie("mail", (String)userDB.get("mail"));
			ckMail.setMaxAge(3600);
			response.addCookie(ckMail);
		}*/
		UserEntity userTest = convertDBObjectToUserEntity(userDB); 
		session.setAttribute("userSession", userTest);
		mv.addObject("user", user);
		return mv;
	}
	
	
	public UserEntity convertDBObjectToUserEntity(DBObject userCursor) {
		@SuppressWarnings("unchecked")
		UserEntity newUser = new UserEntity(
				1L,
				(String)userCursor.get("firstName"),
				(String)userCursor.get("lastName"),
				(String)userCursor.get("mail"),
				(String)userCursor.get("username"),
				(String)userCursor.get("password"),
				(Date)userCursor.get("birthdate"),
				(int)userCursor.get("age"),
				(String)userCursor.get("gender"),
				(String)userCursor.get("phone"),
				(String)userCursor.get("adresse"),
				(int)userCursor.get("postalCode"),
				(String)userCursor.get("city"),
				(String)userCursor.get("country"),
				1L,true,null,null,"",null,null
				);
		
		/*UserEntity newUser = new UserEntity(
				(long)userCursor.get("id"),
				(String)userCursor.get("firstName"),
				(String)userCursor.get("lastName"),
				(String)userCursor.get("mail"),
				(String)userCursor.get("username"),
				(String)userCursor.get("password"),
				(Date)userCursor.get("birthdate"),
				(int)userCursor.get("age"),
				(String)userCursor.get("gender"),
				(String)userCursor.get("phone"),
				(String)userCursor.get("adresse"),
				(int)userCursor.get("postalCode"),
				(String)userCursor.get("city"),
				(String)userCursor.get("country"),
				(long)userCursor.get("lastConnection"),
				(boolean)userCursor.get("Active"),
				(List<String>)userCursor.get("pictures"),
				(List<FlatEntity>)userCursor.get("flats"),
				(String)userCursor.get("stayingTime"),
				(ShowInfo)userCursor.get("infoToShow"),
				(SocialNetwork)userCursor.get("socialNetwork")
				);*/
		return newUser;
	}

	@RequestMapping(value="login", method=RequestMethod.GET)
	public ModelAndView login(ModelAndView mv, HttpSession session){
		if(session.getAttribute("userSession") == null) {
			mv.addObject("user", new UserEntity());
			mv.setViewName("user/login");
			return mv;
		}
		
		mv.setViewName("user/profile");
		return mv;
	}
	
	@RequestMapping(value="logout", method=RequestMethod.GET)
	public String logout(ModelAndView mv, HttpSession session){
		session.removeAttribute("userSession");
        return "redirect:/";
	}
	
	@RequestMapping(value="signup", method=RequestMethod.GET)
	public ModelAndView signup(ModelAndView mv, HttpSession session){
		if(session.getAttribute("userSession") == null) {
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
		session.setAttribute("userSession", user);
		return mv;
	}
	
	@RequestMapping(value="/profile", method=RequestMethod.GET)
	public ModelAndView getProfile(ModelAndView mv, HttpSession session, @RequestHeader(value = "referer", required = false) final String previousURL){

		if(session.getAttribute("userSession") == null) {
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
	public ModelAndView editProfile(ModelAndView mv, HttpSession session){
	if(session.getAttribute("userSession") == null) {
		mv.addObject("user", new UserEntity());
		mv.setViewName("user/login");			
		return mv;
	}
	mv.addObject("userTest", (UserEntity) session.getAttribute("userSession"));
	UserEntity userTest = (UserEntity) session.getAttribute("userSession");
	logger.debug("userTest"+userTest.getFirstName());
	mv.setViewName("user/editProfile2");			
	return mv;
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public ModelAndView editProfile(ModelAndView mv, @ModelAttribute("userForm") UserEntity user, HttpSession session, BindingResult bindingResult){
	    if (bindingResult.hasErrors()) {
	        //errors processing
	    }
	    //logger.debug(user.getAdresse());
		//BasicDBObject query = new BasicDBObject();
		//query.put("username", user.getUsername());
		
		//BasicDBObject userDBObject = userEntityToDBObject(user);
	    
	    logger.debug("User "+user.getAdresse()+ "  "+user.getFirstName()+ " "+user.getLastName());
		
		try {
			//userCollection.findAndModify(query, userDBObject);
			mv.addObject("successMessage", "Your profile is edited successfully");
			mv.setViewName("user/profile");
			return mv;
		}
		catch (Exception e) {
			logger.debug("Excpetion accured"+e);
		}
		mv.setViewName("user/editProfile2");
		mv.addObject("errorMessage", "There was a problem with editing yout profile please try again");
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
		userDBObject.put("gender", user.getGender());
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

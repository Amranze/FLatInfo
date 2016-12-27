package com.flatinfo.Controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.flatinfo.Entity.User.UserEntity;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

//@RestController
@Controller
@RequestMapping(value = "/user")
public class UserController {
	private DBCollection userCollection = MongodbConnection();
	private Logger logger;
	
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
		return usercollection;
	}
	
	public BasicDBObject userEntityToDBObject(UserEntity user){
		BasicDBObject userDBObject = new BasicDBObject();
		userDBObject.put("firstName", user.getFirstName());
		userDBObject.put("lastName", user.getLastName());
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
		userDBObject.put("Active", user.isActive());
		userDBObject.put("pictures", user.getPictures());
		userDBObject.put("flats", user.getFlats());
		userDBObject.put("stayingTime", user.getStayingTime());
		userDBObject.put("infoToShow", user.getInfoToShow());
		userDBObject.put("socialNetwork", user.getSocialNetwork());
		return userDBObject;
	}
}

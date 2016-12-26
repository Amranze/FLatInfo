package com.flatinfo.Controller;

import java.net.UnknownHostException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flatinfo.Entity.Flat.FlatEntity;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

@RestController
@RequestMapping(value = "/Flat")
public class FlatController {
	
	private DBCollection flatCollection = MongodbConnection();

	@RequestMapping(value="/Flats", method=RequestMethod.GET)
	public List<FlatEntity> getAllFlats(){
		
		return null;	
	}
	
	@SuppressWarnings("deprecation")
	private DBCollection MongodbConnection() {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("flat");
		DBCollection flatcollection = db.getCollection("flatCollection");
		return flatcollection;
	}
}

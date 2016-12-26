package com.flatinfo.Controller;

import java.net.UnknownHostException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flatinfo.Entity.Flat.FlatEntity;
import com.flatinfo.Entity.Owner.OwnerEntity;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

@RestController
@RequestMapping(value = "/Owner")
public class OwnerController {
	
	private DBCollection ownerCollection = MongodbConnection();

	@SuppressWarnings("null")
	@RequestMapping(value="/Owners", method=RequestMethod.GET)
	public List<DBObject> getAllOwners(){
		DBCursor ownerCursor = ownerCollection.find();
		List<DBObject> owners = null;
		while(ownerCursor.hasNext()){
			owners.add(ownerCursor.next());
		}
		return owners;
	}
	
	@SuppressWarnings("null")
	@RequestMapping(value="/Owners?", method=RequestMethod.GET)
	public List<DBObject> getOwnersWithSpecification(@RequestBody OwnerEntity ownerSpec){
		DBObject query = new BasicDBObject();
		
		query.put("firstName", ownerSpec.getFirstName());
		query.put("lastName", ownerSpec.getLastName());
		query.put("mail", ownerSpec.getMail());
		query.put("view", ownerSpec.getView());
		query.put("positiveView", ownerSpec.isPositiveView());
		
		DBCursor ownerCursor = ownerCollection.find(query);
		List<DBObject> owners = null;
		while(ownerCursor.hasNext()){
			owners.add(ownerCursor.next());
		}
		return owners;
	}
	
	@RequestMapping(value="/AddOwner", method=RequestMethod.GET)
	public boolean addOwner(@RequestBody OwnerEntity owner){
		String json = (new Gson()).toJson(owner);
		BasicDBObject basicdbObject = new BasicDBObject("owner", json);
		ownerCollection.insert(basicdbObject);
		return true;
	}
	
	@SuppressWarnings("deprecation")
	private DBCollection MongodbConnection() {
		BasicDBObject keys = new BasicDBObject();
		//keys.put("username", 1);
		//keys.put("mail", 2);
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("flat");
		DBCollection ownercollection = db.getCollection("ownerCollection");
		//ownercollection.ensureIndex(keys, "id", true);
		//ownercollection.ensureIndex(new BasicDBObject("username", 1), new BasicDBObject("unique", true));
		//ownercollection.ensureIndex(new BasicDBObject("mail", 2), new BasicDBObject("unique", true));
		//ownercollection.createIndex(keys, new IndexOptions().unique(true));
		return ownercollection;
	}
	
	public BasicDBObject userEntityToDBObject(OwnerEntity owner){
		BasicDBObject ownerDBObject = new BasicDBObject();
		
		ownerDBObject.put("firstName", owner.getFirstName());
		ownerDBObject.put("lastName", owner.getLastName());
		ownerDBObject.put("mail", owner.getMail());
		ownerDBObject.put("phone", owner.getPhone());
		ownerDBObject.put("view", owner.getView());
		ownerDBObject.put("flats", owner.getFlats());
		ownerDBObject.put("positiveView", owner.isPositiveView());
		ownerDBObject.put("rating", owner.getRating());

		return ownerDBObject;
	}

}

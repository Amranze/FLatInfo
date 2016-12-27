package com.flatinfo.Controller;

import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flatinfo.Entity.Flat.ContactInfo;
import com.flatinfo.Entity.Flat.FlatAddress;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

@RestController
@RequestMapping(value = "/flat")
public class FlatController {
	
	private DBCollection flatCollection = MongodbConnection();

	/*@RequestMapping(value="/Flats", method=RequestMethod.GET)
	public List<FlatEntity> getAllFlats(){
		
		return null;	
	}*/
	
	@RequestMapping(value="index", method=RequestMethod.GET)
	public String index(ModelMap model){
		return "index";	
	}
	
	//TODO Inspire from this one :D after some many times that you tried it :p
	@RequestMapping(value="search/", method = RequestMethod.POST)
	public ContactInfo searchFlat(@ModelAttribute("search") String address){
		System.out.println("Looking for a flat "+address);
		String[] splitedAddress = address.split(" ");
		int i =0;
		for(String s : splitedAddress)
			System.out.println("The "+ i++ +" split is "+ s);
		ContactInfo contactInfo = new ContactInfo(new FlatAddress(splitedAddress[0], splitedAddress[1], splitedAddress[2], 
				Integer.valueOf(splitedAddress[3])), splitedAddress[4], "France" );
		
		/*DBCursor testDb = flatCollection.find();
		while(testDb.hasNext()){
			System.out.println(testDb.curr().toString());
		}*/
		
		DBCursor flatDB = flatCollection.find(entityToDBObject(contactInfo));
		System.out.println("The size of the result "+flatDB.count());
		while(flatDB.hasNext()){
			System.out.println("It has a result");
			flatDB.next();
		}
		return contactInfo;
	}
	
	public DBObject entityToDBObject(ContactInfo contactInfo){
		DBObject flatQuery = new BasicDBObject();
		
		DBObject flatAddressQuery = new BasicDBObject();
		flatAddressQuery.put("roadNumber", contactInfo.getAddress().getRoadNumber());
		flatAddressQuery.put("roadWay", contactInfo.getAddress().getRoadWay());
		flatAddressQuery.put("roadName", contactInfo.getAddress().getRoadName());
		flatAddressQuery.put("postalCode", contactInfo.getAddress().getPostalCode());

		flatQuery.put("FlatAddress", flatAddressQuery);
		flatQuery.put("city", contactInfo.getCity());
		flatQuery.put("Country", contactInfo.getCountry());
		
		System.out.println("The query is "+ flatQuery);
		return flatQuery;
	}
	
	@SuppressWarnings("deprecation")
	private DBCollection MongodbConnection() {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("flat");
		System.out.println(db.getCollectionNames());
		DBCollection flatcollection = db.getCollection("flatcollection");
		return flatcollection;
	}
}

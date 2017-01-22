package flatinfo.rest.mvc;


import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.QueryBuilder;

import flatinfo.core.models.entities.flat.ContactInfo;
import flatinfo.core.models.entities.flat.FlatAddress;

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
	public ModelAndView searchFlat(@ModelAttribute("search") String address){
		ModelAndView model = new ModelAndView();
		model.setViewName("flat");
		model.addObject("address", address);
		
		/*if(flatCollection.getIndexInfo().isEmpty())
			flatCollection.createIndex(new BasicDBObject ("FlatAddress.roadName", "text"));
		for(DBObject s : flatCollection.getIndexInfo())
			System.out.println("The index is "+s);*/
		
		String[] splitedAddress = address.split(",");
		int i =0;
		for(String s : splitedAddress)
			System.out.println("The "+ i++ +" split is "+ s);
		
		/*String[] splitedFlatAddress = splitedAddress[0].split(" ");
		i =0;
		for(String s : splitedFlatAddress)
			System.out.println("The "+ i++ +" splitedFlatAddress is "+ s);
		*/
		ContactInfo contactInfo = new ContactInfo(new FlatAddress(splitedAddress[0]), splitedAddress[1].substring(1), splitedAddress[2].substring(1) );
		DBCursor flatDB = flatCollection.find(regexQuery(contactInfo));
		System.out.println("The size of the result "+flatDB.count());
		while(flatDB.hasNext()){
			System.out.println("It has a result");
			flatDB.next();
		}
		return model;
	}
	
	public DBObject regexQuery(ContactInfo contactInfo){
		DBObject flatAddressQuery = QueryBuilder.start().text(contactInfo.getAddress().getRoadName()).get();
		flatAddressQuery.put("city", contactInfo.getCity());
		flatAddressQuery.put("Country", contactInfo.getCountry());
		System.out.println("flatQuery "+flatAddressQuery);

		return flatAddressQuery;
	}
	
	public DBObject entityToDBObject(ContactInfo contactInfo){
		DBObject flatQuery = new BasicDBObject();
		
		DBObject flatAddressQuery = new BasicDBObject();
		//flatAddressQuery.put("roadNumber", contactInfo.getAddress().getRoadNumber());
		//flatAddressQuery.put("roadWay", contactInfo.getAddress().getRoadWay());
		flatAddressQuery.put("roadName", contactInfo.getAddress().getRoadName());
		//flatAddressQuery.put("flatNumber", contactInfo.getAddress().getFlatNumber());
		//flatAddressQuery.put("buildingNumber", contactInfo.getAddress().getBuildingNumber());

		//flatAddressQuery.put("postalCode", contactInfo.getAddress().getPostalCode());

		flatQuery.put("FlatAddress", flatAddressQuery);
		flatQuery.put("City", contactInfo.getCity());
		flatQuery.put("Country", contactInfo.getCountry());
		
		System.out.println("The query is "+ flatQuery);
		return flatQuery;
	}
	
	@SuppressWarnings("deprecation")
	private DBCollection MongodbConnection() {
		@SuppressWarnings("resource")
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("flat");
		System.out.println(db.getCollectionNames());
		DBCollection flatcollection = db.getCollection("flatcollection");
		return flatcollection;
	}
}

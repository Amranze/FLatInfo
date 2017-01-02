
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*import com.flatinfo.Entity.Flat.ContactInfo;
import com.flatinfo.Entity.Flat.FlatAddress;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.QueryBuilder;

import java.util.regex.Pattern;
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})

public class MongoTest {
	
	@Test
	public void testRun(){
		int var = 21;
		assert var == 21;
		
	}
	
//	private DBCollection flatTestCollection = MongodbTestConnection();
//	
//	@Test
//	public void addDatatoDB(){
//		ContactInfo contactInfo0 = new ContactInfo(new FlatAddress("Bis Boulevard Sainte-Hélène"),"Toulon" , "France" );
//		ContactInfo contactInfo3 = new ContactInfo(new FlatAddress("81 Bis Boulevard Sainte-Hélène"),"Toulon" , "France" );
//		ContactInfo contactInfo4 = new ContactInfo(new FlatAddress("81Bis Bis Boulevard Sainte-Hélène"),"Toulon" , "France" );
//		ContactInfo contactInfo1 = new ContactInfo(new FlatAddress("81 rue riquet"),"Paris" , "France" );
//		ContactInfo contactInfo2 = new ContactInfo(new FlatAddress("81 rue riquet"),"Paris" , "France" );
//		
//		/*DBObject newContact = entityToDBObject(contactInfo0);
//		flatCollection.insert(newContact);
//	
//		newContact = entityToDBObject(contactInfo1);
//		flatCollection.insert(newContact);
//		newContact = entityToDBObject(contactInfo2);
//		flatCollection.insert(newContact);
//		newContact = entityToDBObject(contactInfo3);
//		flatCollection.insert(newContact);
//		newContact = entityToDBObject(contactInfo4);
//		flatCollection.insert(newContact);*/
//				
//		ContactInfo contactInfoResult = new ContactInfo(new FlatAddress("Boulevard Sainte-Hélène"),"Toulon" , "France" );
//
//		//DBObject newQuery = entityToDBObject(contactInfoResult);
//		String searchWord = "Boulevard Sainte-Hélène";
//		flatCollection.createIndex(new BasicDBObject ("FlatAddress.roadName", "text"));
//		DBObject q = QueryBuilder.start().text(searchWord).get();
//		q.put("city", "Toulon");
//		q.put("Country", "France");
//		DBCursor usersDb = flatCollection.find(q);
//		System.out.println("query "+q);
//		System.out.println("Size  "+usersDb.count());
//		
//
//		DBCursor flatDB = flatCollection.find();
//		System.out.println("The size of the result "+flatDB.count());
//		while(flatDB.hasNext()){
//			System.out.println("It has a result");
//			flatDB.next();
//		}
//	}
//	
//	public DBObject entityToDBObject(ContactInfo contactInfo){
//		DBObject flatQuery = new BasicDBObject();
//		
//		DBObject flatAddressQuery = new BasicDBObject();
//		//flatAddressQuery.put("roadNumber", contactInfo.getAddress().getRoadNumber());
//		//flatAddressQuery.put("roadWay", contactInfo.getAddress().getRoadWay());
//		flatAddressQuery.put("roadName", contactInfo.getAddress().getRoadName());
//		//flatAddressQuery.put("flatNumber", contactInfo.getAddress().getFlatNumber());
//		//flatAddressQuery.put("buildingNumber", contactInfo.getAddress().getBuildingNumber());
//
//		//flatAddressQuery.put("postalCode", contactInfo.getAddress().getPostalCode());
//
//		flatQuery.put("FlatAddress", flatAddressQuery);
//		flatQuery.put("city", contactInfo.getCity());
//		flatQuery.put("Country", contactInfo.getCountry());
//		
//		System.out.println("The query is "+ flatQuery);
//		return flatQuery;
//	}
//	
//	@SuppressWarnings("deprecation")
//	private DBCollection MongodbTestConnection() {
//		MongoClient mongo = new MongoClient("localhost", 27017);
//		DB db = mongo.getDB("flat");
//		System.out.println(db.getCollectionNames());
//		DBCollection flatTestcollection = db.getCollection("flatcollection");
//		return flatTestcollection;
//	}
}

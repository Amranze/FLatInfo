package flatinfo.core.services.util;

import com.mongodb.BasicDBObject;

import flatinfo.core.models.entities.flat.FlatEntity;
import flatinfo.core.models.entities.owner.OwnerEntity;
import flatinfo.core.models.entities.user.UserEntity;

public class ConvertToDBObject {
	//TODO finish this
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
	public BasicDBObject flatEntityToDBObject(FlatEntity flat){
		return null;
	}
	public BasicDBObject ownerEntityToDBObject(OwnerEntity owner){
		return null;
	}
}

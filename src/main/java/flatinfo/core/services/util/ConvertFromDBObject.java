package flatinfo.core.services.util;

import java.util.Date;

import com.mongodb.DBObject;

import flatinfo.core.models.entities.flat.FlatEntity;
import flatinfo.core.models.entities.owner.OwnerEntity;
import flatinfo.core.models.entities.user.UserEntity;

public class ConvertFromDBObject {
	//TODO finish this

	public UserEntity convertDBObjectToUserEntity(DBObject userCursor) {
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
				1L,true,
				(String)userCursor.get("profilePicture"),
				null,null, null,"",null,null
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

	public FlatEntity convertDBObjectToFlatEntity(DBObject userCursor){
		return null;
	}

	public OwnerEntity convertDBObjectToOwnerEntity(DBObject userCursor){
		return null;
	}

}

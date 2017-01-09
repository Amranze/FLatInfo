package flatinfo.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import flatinfo.core.models.entities.user.UserEntity;
import flatinfo.core.services.util.UserEntityList;

@Repository
//public interface UserRepository extends PagingAndSortingRepository<UserEntity, String>{ 
public interface UserRepository extends MongoRepository<UserEntity, String>{ 

	public UserEntityList findAllUsers(); 
	public UserEntity findUser(Long id); 
	//name can be mail or username
	public UserEntity findUserByName(String name); 
	public UserEntity addUser(UserEntity user); 
}

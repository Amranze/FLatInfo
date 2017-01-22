package flatinfo.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import flatinfo.core.models.entities.user.UserEntity;

@Repository
//public interface UserRepository extends PagingAndSortingRepository<UserEntity, String>{ 
public interface UserRepository extends MongoRepository<UserEntity, String>{ 

	public List<UserEntity> findAllUsers(); 
	public UserEntity findUser(Long id); 
	//name can be mail or username
	public UserEntity findUserByName(String name); 
	public UserEntity addUser(UserEntity user); 
	public void findUserAndModify(UserEntity user);
	
}

package flatinfo.core.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import flatinfo.core.models.entities.user.UserEntity;
import flatinfo.core.services.util.UserEntityList;

public interface UserRepository extends PagingAndSortingRepository<UserEntity, String>{ 
	public UserEntityList findAllUsers(); 
	public UserEntity findUser(Long id); 
	//name can be mail or username
	public UserEntity findUserByName(String name); 
	public UserEntity addUser(UserEntity user); 
}

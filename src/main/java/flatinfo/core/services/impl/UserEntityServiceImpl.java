package flatinfo.core.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import flatinfo.core.models.entities.flat.FlatEntity;
import flatinfo.core.models.entities.owner.OwnerEntity;
import flatinfo.core.models.entities.user.UserEntity;
import flatinfo.core.repositories.UserRepository;
import flatinfo.core.services.UserEntityService;
import flatinfo.core.services.util.UserEntityList;


@Service
//@Repository
@Transactional
//@EnableMongoRepositories(basePackages = "flatinfo.core.repository")
public class UserEntityServiceImpl implements UserEntityService{
	
	@Autowired
    MongoTemplate mongoTemplate;
	
	@Autowired 
	private UserRepository userEntityRepo;
	
	@Override
	public UserEntity findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity findByAccount(String account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntityList findByFlat(FlatEntity flat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntityList findByFlatOwner(OwnerEntity owner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntityList findByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntityList findAllUsers() {
		return (UserEntityList) mongoTemplate.findAll(UserEntity.class);
	}

	@Override
	public UserEntity addUser(UserEntity user) {
		mongoTemplate.save(user);
		return user;
	}

	@Override
	public UserEntity updateUser(UserEntity user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity deleteUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlatEntity addFlat(Long id, FlatEntity flat) {
		// TODO Auto-generated method stub
		return null;
	}

}

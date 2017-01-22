package flatinfo.core.repositories.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.mongodb.DBObject;

import flatinfo.core.models.entities.user.UserEntity;
import flatinfo.core.repositories.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository{

	@Autowired
    MongoTemplate mongoTemplate;
	
	@Override
	public <S extends UserEntity> List<S> save(Iterable<S> entites) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserEntity> findAll() {
		List<UserEntity> users = mongoTemplate.findAll(UserEntity.class);
		if(users != null){
			System.out.println("There is some users");
			return users;
		}
		return null;
	}

	@Override
	public List<UserEntity> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserEntity> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserEntity> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserEntity> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserEntity> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<UserEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UserEntity findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<UserEntity> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends UserEntity> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends UserEntity> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserEntity> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends UserEntity> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserEntity> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity findUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity findUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity addUser(UserEntity user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void findUserAndModify(UserEntity user) {
		/*Query searchUserQuery = new Query(Criteria.where("username").is(user.getUsername()));
		UserEntity savedUser = mongoTemplate.findOne(searchUserQuery, UserEntity.class);
		//Update update = fromDBObjectExcludeNullFields();
		if(savedUser != null) System.out.println(savedUser.toString());
		if(savedUser == null || savedUser.equals(null))*/
			//mongoTemplate.findAndModify(searchUserQuery, Update.update("", value), UserEntity.class);
		save(user);
	}
	
	public static Update fromDBObjectExcludeNullFields(DBObject object) {
	    Update update = new Update();       
	    for (String key : object.keySet()) {
	        Object value = object.get(key);
	        if(value!=null){
	            update.set(key, value);
	        }
	    }
	    return update;
	}

	@Override
	public <S extends UserEntity> S save(S user) {
		mongoTemplate.save(user);
		return user;
		/*Query searchUserQuery = new Query(Criteria.where("username").is(user.getUsername()));
		UserEntity savedUser = mongoTemplate.findOne(searchUserQuery, UserEntity.class);
		if(savedUser == null || savedUser.equals(null))
			mongoTemplate.insert(user);
		else
			mongoTemplate.updateFirst(searchUserQuery, new Update(), UserEntity.class);
			//mongoTemplate.findAndModify(searchUserQuery, Update.update("", value), UserEntity.class);
		return user;*/
	}
}

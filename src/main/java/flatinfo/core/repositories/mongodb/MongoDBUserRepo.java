package flatinfo.core.repositories.mongodb;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import flatinfo.core.models.entities.user.UserEntity;
import flatinfo.core.repositories.UserRepository;
import flatinfo.core.services.util.UserEntityList;

public class MongoDBUserRepo implements UserRepository {

	@Override
	public UserEntityList findAllUsers() {
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
	public Iterable<UserEntity> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<UserEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserEntity> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserEntity> Iterable<S> save(Iterable<S> entities) {
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
	public Iterable<UserEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
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

}

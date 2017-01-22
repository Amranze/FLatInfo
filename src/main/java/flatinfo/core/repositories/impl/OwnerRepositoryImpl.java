package flatinfo.core.repositories.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import flatinfo.core.models.entities.owner.OwnerEntity;
import flatinfo.core.repositories.OwnerRepository;
import flatinfo.core.services.util.OwnerEntityList;

@Repository
public class OwnerRepositoryImpl implements OwnerRepository{

	@Autowired
    MongoTemplate mongoTemplate;

	@Override
	public <S extends OwnerEntity> List<S> save(Iterable<S> entites) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OwnerEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OwnerEntity> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OwnerEntity> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OwnerEntity> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OwnerEntity> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OwnerEntity> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<OwnerEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OwnerEntity> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OwnerEntity findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<OwnerEntity> findAll(Iterable<String> ids) {
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
	public void delete(OwnerEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends OwnerEntity> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends OwnerEntity> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OwnerEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OwnerEntity> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends OwnerEntity> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<OwnerEntity> findAllOwners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OwnerEntity findOwner(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OwnerEntity findOwnerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OwnerEntity addOwner(OwnerEntity owner) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

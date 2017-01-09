package flatinfo.core.repositories.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import flatinfo.core.models.entities.flat.FlatEntity;
import flatinfo.core.repositories.FlatRepository;
import flatinfo.core.services.util.FlatEntityList;

@Repository
public class FlatRepositoryImpl implements FlatRepository{
	
	@Autowired
    MongoTemplate mongoTemplate;

	@Override
	public <S extends FlatEntity> List<S> save(Iterable<S> entites) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FlatEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FlatEntity> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FlatEntity> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FlatEntity> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FlatEntity> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FlatEntity> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<FlatEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FlatEntity> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlatEntity findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<FlatEntity> findAll(Iterable<String> ids) {
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
	public void delete(FlatEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends FlatEntity> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends FlatEntity> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FlatEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FlatEntity> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends FlatEntity> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public FlatEntityList findAllFlats() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlatEntity findFlat(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlatEntity findFlatByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlatEntity addFlat(FlatEntity flat) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

package com.flatinfo.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.flatinfo.Entity.Flat.FlatEntity;

public interface FlatRepository extends MongoRepository<FlatEntity, String>{
	
    /*public FlatEntity findByFirstName(String firstName);
    public List<FlatEntity> findByLastName(String lastName);*/

}

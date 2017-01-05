package com.flatinfo.Repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.flatinfo.Entity.User.UserEntity;


public interface UserRepository extends MongoRepository<UserEntity, String> {
    public UserEntity findByFirstName(String firstName);
    public List<UserEntity> findByLastName(String lastName);
    //Account maybe mail or username
    public UserEntity findUserByAccount(String account, String encodedPassword);
}

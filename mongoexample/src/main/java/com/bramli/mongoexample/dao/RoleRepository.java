package com.bramli.mongoexample.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bramli.mongoexample.model.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends MongoRepository<Role, Long> {

    public Role findBynom(String nom);


}

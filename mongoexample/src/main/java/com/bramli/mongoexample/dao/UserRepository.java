package com.bramli.mongoexample.dao;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.bramli.mongoexample.model.AppUser;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<AppUser, Long> {

	public AppUser findBynom(String nom);

	public AppUser findBytel(String tel);
}

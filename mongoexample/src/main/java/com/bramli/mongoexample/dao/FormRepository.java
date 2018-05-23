package com.bramli.mongoexample.dao;

import com.bramli.mongoexample.model.AppUser;
import com.bramli.mongoexample.model.Form;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ahmed on 11/04/2018.
 */
@Repository
public interface FormRepository extends MongoRepository<Form,Long> {

    public Form findBytitre(String nom);
}

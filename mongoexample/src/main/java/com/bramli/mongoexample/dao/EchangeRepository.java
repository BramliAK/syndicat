package com.bramli.mongoexample.dao;

import com.bramli.mongoexample.model.Echange;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ahmed on 11/04/2018.
 */
@Repository
public interface EchangeRepository extends MongoRepository<Echange, Long> {

    public Echange findBytelAndId(String tel,Long id);
}


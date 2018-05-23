package com.bramli.mongoexample.dao;

import com.bramli.mongoexample.model.Rapport;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ahmed on 26/04/2018.
 */
@Repository
public interface RapportRepository extends MongoRepository<Rapport,Long> {

    public List<Rapport> findBytype(String type);
}

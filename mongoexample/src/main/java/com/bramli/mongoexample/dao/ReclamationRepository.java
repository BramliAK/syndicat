package com.bramli.mongoexample.dao;

import com.bramli.mongoexample.model.Reclamation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ahmed on 12/04/2018.
 */
@Repository
public interface ReclamationRepository extends MongoRepository<Reclamation,Long> {
}

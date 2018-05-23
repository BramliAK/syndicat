package com.bramli.mongoexample.dao;

import com.bramli.mongoexample.model.Vente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ahmed on 09/04/2018.
 */
@Repository
public interface VenteRepository extends MongoRepository<Vente, Long> {

    public Vente findBycategorie(String categorie);
    public Vente findBytelAndId(String tel,Long id);
    public Vente findBytitre(String titre);
}

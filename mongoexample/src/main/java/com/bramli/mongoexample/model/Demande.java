package com.bramli.mongoexample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ahmed on 12/04/2018.
 */
@Document
public class Demande {
    @Id
    private Long id;
    private String demande;
    private Long idUser;

    public Demande(Long id, String demande, Long idUser) {
        this.id = id;
        this.demande = demande;
        this.idUser = idUser;
    }

    public Demande() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDemande() {
        return demande;
    }

    public void setDemande(String demande) {
        this.demande = demande;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
}

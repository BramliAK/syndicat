package com.bramli.mongoexample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ahmed on 12/04/2018.
 */
@Document
public class Reclamation {
    @Id
    private Long id;
    private Long IdUser;
    private String reclamation;

    public Reclamation() {
    }

    public Reclamation(Long id, Long idUser, String reclamation) {
        this.id = id;
        IdUser = idUser;
        this.reclamation = reclamation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUser() {
        return IdUser;
    }

    public void setIdUser(Long idUser) {
        IdUser = idUser;
    }

    public String getReclamation() {
        return reclamation;
    }

    public void setReclamation(String reclamation) {
        this.reclamation = reclamation;
    }
}

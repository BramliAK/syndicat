package com.bramli.mongoexample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ahmed on 27/04/2018.
 */
@Document
public class Dettes {

    @Id
    private Long id;
    private String emailUser;
    private String type;
    private float prix;

    public Dettes() {
    }

    public Dettes(Long id, String emailUser, String type, float prix) {
        this.id = id;
        this.emailUser = emailUser;
        this.type = type;
        this.prix = prix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
}

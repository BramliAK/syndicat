package com.bramli.mongoexample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ahmed on 11/04/2018.
 */
@Document
public class Echange {
    @Id
    private Long id;
    private String titre;
    private String tel;
    private String echange;
    private String categorie;
    private String desciption;
    private String image;

    public Echange() {
    }

    public Echange(Long id, String titre, String tel, String echange, String categorie, String desciption, String image) {
        this.id = id;
        this.titre = titre;
        this.tel = tel;
        this.echange = echange;
        this.categorie = categorie;
        this.desciption = desciption;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEchange() {
        return echange;
    }

    public void setEchange(String echange) {
        this.echange = echange;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

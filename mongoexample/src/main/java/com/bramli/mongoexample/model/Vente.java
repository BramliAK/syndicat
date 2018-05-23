package com.bramli.mongoexample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ahmed on 09/04/2018.
 */
@Document
public class Vente {
    @Id
    private Long id;
    private String titre;
    private String tel;
    private float prix;
    private String categorie;
    private String desciption;
    private String image;

    public Vente() {
    }

    public Vente(Long id, String titre, String tel, float prix, String categorie, String desciption, String image) {
        this.id = id;
        this.titre = titre;
        this.tel = tel;
        this.prix = prix;
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

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
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

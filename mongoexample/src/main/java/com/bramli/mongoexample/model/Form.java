package com.bramli.mongoexample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * Created by ahmed on 11/04/2018.
 */
@Document
public class Form {

    @Id
    private Long id;
    private String titre;
    private List<Disscution> disscution;
    private String date;

    public Form() {
    }

    public Form(Long id, String titre, List<Disscution> disscution, String date) {
        this.id = id;
        this.titre = titre;
        this.disscution = disscution;
        this.date = date;
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

    public List<Disscution> getDisscution() {
        return disscution;
    }

    public void setDisscution(List<Disscution> disscution) {
        this.disscution = disscution;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

package com.bramli.mongoexample.model;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



/**
 * Created by ahmed on 25/04/2018.
 */
@Document
public class Rapport {
    @Id
    private Long id;
    private String sujet ;
    private String titre;
    private String type;

    public Rapport() {
    }

    public Rapport(Long id, String sujet, String titre, String type) {
        this.id = id;
        this.sujet = sujet;
        this.titre = titre;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

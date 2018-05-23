package com.bramli.mongoexample.model;

/**
 * Created by ahmed on 11/04/2018.
 */
public class Disscution {
    private Long id;
    private String iduser;
    private String commentaire;

    public Disscution() {
    }

    public Disscution(Long id, String iduser, String commentaire) {
        this.id = id;
        this.iduser = iduser;
        this.commentaire = commentaire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}

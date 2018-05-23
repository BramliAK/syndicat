package com.bramli.mongoexample.model;

import java.util.List;

/**
 * Created by ahmed on 02/05/2018.
 */
public class JoinUserVente {

    private Vente vente;
    private AppUser user;

    public JoinUserVente() {
    }

    public JoinUserVente(Vente vente, AppUser user) {
        this.vente = vente;
        this.user = user;
    }

    public Vente getVente() {
        return vente;
    }

    public void setVente(Vente vente) {
        this.vente = vente;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }
}

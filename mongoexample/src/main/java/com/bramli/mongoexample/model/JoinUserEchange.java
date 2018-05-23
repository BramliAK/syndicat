package com.bramli.mongoexample.model;

/**
 * Created by ahmed on 02/05/2018.
 */
public class JoinUserEchange {
    private AppUser user;
    private Echange echange;

    public JoinUserEchange() {
    }

    public JoinUserEchange(AppUser user, Echange echange) {
        this.user = user;
        this.echange = echange;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public Echange getEchange() {
        return echange;
    }

    public void setEchange(Echange echange) {
        this.echange = echange;
    }
}

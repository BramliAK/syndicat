package com.bramli.mongoexample.service;

import com.bramli.mongoexample.model.AppUser;
import com.bramli.mongoexample.model.Role;

/**
 * Created by ahmed on 07/04/2018.
 */
public interface AccountService {
    public AppUser saveUser(AppUser appUser);
    public Role saveRole(Role role);
    public void addRoleToUser(String usernom,String rolenom);
    public AppUser findUserBynom(String nom);
}

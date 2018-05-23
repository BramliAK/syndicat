package com.bramli.mongoexample.service;

import com.bramli.mongoexample.dao.RoleRepository;
import com.bramli.mongoexample.dao.UserRepository;
import com.bramli.mongoexample.model.AppUser;
import com.bramli.mongoexample.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ahmed on 07/04/2018.
 */
@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public AppUser saveUser(AppUser appUser) {
        String hashPW=bCryptPasswordEncoder.encode(appUser.getPassword());
        appUser.setPassword(hashPW);
        return userRepository.save(appUser);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String usernom, String rolenom) {
        Role role=roleRepository.findBynom(rolenom);
        AppUser appUser =userRepository.findBynom(usernom);
        appUser.getRole().add(role);
    }

    @Override
    public AppUser findUserBynom(String nom) {
        return userRepository.findBynom(nom);
    }
}

package com.bramli.mongoexample.controller;

import com.bramli.mongoexample.dao.RoleRepository;
import com.bramli.mongoexample.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * Created by ahmed on 08/04/2018.
 */

@RestController
public class RoleRestService {
    @Autowired
    private RoleRepository roleRepository;
    @GetMapping("/role")
    public List<Role> getAllrole(){
        return roleRepository.findAll();
    }
    @GetMapping("/role/{id}")
    public Optional<Role> getrole(@PathVariable Long id){//@PathVariable:You give Spring a value of "{john}" to the path variable loginName, so Spring get it with the "{}"
        return roleRepository.findById(id);
    }
}

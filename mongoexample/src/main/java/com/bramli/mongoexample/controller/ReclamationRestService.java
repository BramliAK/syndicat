package com.bramli.mongoexample.controller;

import com.bramli.mongoexample.dao.ReclamationRepository;
import com.bramli.mongoexample.model.Reclamation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * Created by ahmed on 12/04/2018.
 */
@RestController
public class ReclamationRestService {

    @Autowired
    private ReclamationRepository reclamationRepository;

    @GetMapping("/reclamation")
    public List<Reclamation> getAllUser(){
        return reclamationRepository.findAll();
    }
    @GetMapping("/reclamation/{id}")
    public Optional<Reclamation> getUser(@PathVariable Long id){//@PathVariable:You give Spring a value of "{john}" to the path variable loginName, so Spring get it with the "{}"
        return reclamationRepository.findById(id);
    }
    @PostMapping("/reclamation")
    public Reclamation createUser(@Valid @RequestBody Reclamation rec){
        return reclamationRepository.save(rec);
    }

    @DeleteMapping("/reclamation/{id}")
    public boolean deleteuser(@PathVariable Long id){
        reclamationRepository.deleteById(id);
        return true;
    }

    @PutMapping("/reclamation/{id}")
    //@RequestMapping(value="/appUser/{id}",method=RequestMethod.PUT)
    public Reclamation update(@PathVariable Long id, @Valid @RequestBody Reclamation rec){
        rec.setId(id);
        return reclamationRepository.save(rec);
    }
}

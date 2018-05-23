package com.bramli.mongoexample.controller;

import com.bramli.mongoexample.dao.FormRepository;
import com.bramli.mongoexample.model.Disscution;
import com.bramli.mongoexample.model.Form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by ahmed on 11/04/2018.
 */
@RestController
public class FormRestService {
    @Autowired
    private FormRepository formRepository;

    @GetMapping("/form/{id}")
    public Optional<Form> getForm(@PathVariable Long id){//@PathVariable:You give Spring a value of "{john}" to the path variable loginName, so Spring get it with the "{}"
        return formRepository.findById(id);
    }

    @GetMapping("/form")
    public List<Form> getallform(){return formRepository.findAll();}

    @GetMapping("/formt/{titre}")
    public Form getformBytitre(@PathVariable String titre){return formRepository.findBytitre(titre);}

    @DeleteMapping("/form/{id}")
    public boolean deletevente(@PathVariable Long id){
        formRepository.deleteById(id);
        return true;
    }
    @PutMapping("/form/{id}")
    //@RequestMapping(value="/appUser/{id}",method=RequestMethod.PUT)
    public Form update(@PathVariable Long id, @Valid @RequestBody Form form){
        form.setId(id);
        return formRepository.save(form);
    }
    @PostMapping("/form")
    public Form postform(@Valid @RequestBody Form form){
        return formRepository.save(form);
    }

    @PostMapping("/form/{titre}")
    public Form postdis(@PathVariable String titre ,@Valid @RequestBody Disscution disscution){
        Form f=new Form();
        Disscution e=new Disscution();
        f=formRepository.findBytitre(titre);

        f.getDisscution().add(disscution);
        f.setDisscution(f.getDisscution());

        return formRepository.save(f);


    }
}

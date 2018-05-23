package com.bramli.mongoexample.controller;

import com.bramli.mongoexample.dao.EchangeRepository;
import com.bramli.mongoexample.dao.UserRepository;
import com.bramli.mongoexample.model.Echange;
import com.bramli.mongoexample.model.JoinUserEchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

/**
 * Created by ahmed on 11/04/2018.
 */

@RestController
public class EchangeRestService {
    @Autowired
    private EchangeRepository echangeRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/echange")
    public List<Echange> getAllEchanges(){
        return echangeRepository.findAll();
    }
    @GetMapping("/echange/{id}")
    public Optional<Echange> getrole(@PathVariable Long id){//@PathVariable:You give Spring a value of "{john}" to the path variable loginName, so Spring get it with the "{}"
        return echangeRepository.findById(id);
    }

    @PostMapping(value = "/echange",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String createVente(@RequestParam("file") MultipartFile file, @RequestParam("id") String id, @RequestParam("titre") String titre, @RequestParam("tel") String tel
            , @RequestParam("echange") String ech, @RequestParam("categorie") String categorie, @RequestParam("des") String des) throws IOException {
        //Vente vente=null;
        File convertFile=new File("D:\\sandicat_front\\Sandica\\src\\assets\\images\\"+file.getOriginalFilename());
        convertFile.createNewFile();
        FileOutputStream fout=new FileOutputStream(convertFile);
        fout.write(file.getBytes());
        fout.close();
        Echange echange=new Echange();

        echange.setId(Long.valueOf(id));
        echange.setCategorie(categorie);
        echange.setDesciption(des);
        echange.setImage(file.getOriginalFilename());
        echange.setEchange(ech);
        echange.setTel(tel);
        echange.setTitre(titre);

        echangeRepository.save(echange);
        return des;
    }

    @GetMapping("/echange/{tel}/{id}")
    public JoinUserEchange getBytel(@PathVariable String tel, @PathVariable Long id)
    {
        JoinUserEchange join=new JoinUserEchange();
        join.setEchange(echangeRepository.findBytelAndId(tel,id));
        join.setUser(userRepository.findBytel(tel));
        return join;
    }
}

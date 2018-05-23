package com.bramli.mongoexample.controller;

import com.bramli.mongoexample.dao.UserRepository;
import com.bramli.mongoexample.dao.VenteRepository;
import com.bramli.mongoexample.model.JoinUserVente;
import com.bramli.mongoexample.model.Vente;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.*;
import java.util.List;
import java.util.Optional;

/**
 * Created by ahmed on 09/04/2018.
 */
@RestController
public class VenteRestService {
    @Autowired
    private VenteRepository venteRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findBytitre/{categorie}")
    public Vente getByname(@PathVariable String categorie){
        return venteRepository.findBytitre(categorie);
    }

    @GetMapping("/tell/{tel}/{id}")
    public JoinUserVente getBytel(@PathVariable String tel,@PathVariable Long id)
    {
        JoinUserVente join=new JoinUserVente();
        join.setVente(venteRepository.findBytelAndId(tel,id));
        join.setUser(userRepository.findBytel(tel));
        return join;
    }


    @PostMapping(value = "/vente",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String createVente(@RequestParam("file") MultipartFile file, @RequestParam("id") String id, @RequestParam("titre") String titre, @RequestParam("tel") String tel
            , @RequestParam("prix") String prix, @RequestParam("categorie") String categorie, @RequestParam("des") String des) throws IOException {
        //Vente vente=null;
        File convertFile=new File("D:\\sandicat_front\\Sandica\\src\\assets\\images\\"+file.getOriginalFilename());
        convertFile.createNewFile();
        FileOutputStream fout=new FileOutputStream(convertFile);
        fout.write(file.getBytes());
        fout.close();
        Vente vente=new Vente();

        vente.setId(Long.valueOf(id));
        vente.setCategorie(categorie);
        vente.setDesciption(des);
        vente.setImage(file.getOriginalFilename());
        vente.setPrix(Float.parseFloat(prix));
        vente.setTel(tel);
        vente.setTitre(titre);

        venteRepository.save(vente);
        return des;
    }
    @GetMapping("/vente")
    public List<Vente> getAllUser(){
        return venteRepository.findAll();
    }


    @GetMapping("/vente/{id}")
    public Optional<Vente> getUser(@PathVariable Long id){//@PathVariable:You give Spring a value of "{john}" to the path variable loginName, so Spring get it with the "{}"
        return venteRepository.findById(id);
    }

    @DeleteMapping("/vente/{id}")
    public boolean deletevente(@PathVariable Long id){
        venteRepository.deleteById(id);
        return true;
    }
    @PutMapping("/vente/{id}")
    //@RequestMapping(value="/appUser/{id}",method=RequestMethod.PUT)
    public Vente update(@PathVariable Long id, @Valid @RequestBody Vente vente){
        vente.setId(id);
        return venteRepository.save(vente);
    }



}

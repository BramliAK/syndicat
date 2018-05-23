package com.bramli.mongoexample.controller;

import com.bramli.mongoexample.dao.RapportRepository;
import com.bramli.mongoexample.model.Rapport;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

/**
 * Created by ahmed on 26/04/2018.
 */
@RestController
public class RapportRestService  {
    @Autowired
    private RapportRepository rapportRepository;


    @GetMapping("/rapprt/{id}")
    public Optional<Rapport> getrapport(@PathVariable Long id){//@PathVariable:You give Spring a value of "{john}" to the path variable loginName, so Spring get it with the "{}"
        return rapportRepository.findById(id);
    }

    @GetMapping("/rapprt")
    public List<Rapport> getallrapport(){return rapportRepository.findAll();}
    @PostMapping("/rapprt")
    public Rapport postQrapport(@Valid @RequestBody Rapport rapport){
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\ahmed\\Desktop\\pdf\\"+rapport.getTitre()+".pdf"));

            //open
            document.open();

            Paragraph p = new Paragraph();
            p.add(rapport.getTitre());
            p.setAlignment(Element.ALIGN_CENTER);

            document.add(p);
            Paragraph p1 = new Paragraph();
            p1.add("MAHA LOVE KHALIL"); //no alignment
            p1.setAlignment(Element.ALIGN_RIGHT);
            document.add(p1);

            Paragraph p3 = new Paragraph();
            p3.add("BELLI 3AML FEHA"); //no alignment
            p3.setAlignment(Element.ALIGN_LEFT);
            document.add(p3);

            Paragraph p2 = new Paragraph();
            p2.add(rapport.getSujet()); //no alignment
            p2.setAlignment(500);
            document.add(p2);

            Font f = new Font();

            //f.setStyle(Font.BOLD);
            //f.setSize(16);

            document.add(new Paragraph("This is my paragraph 3", f));

            //close
            document.close();

            System.out.println("Done");

        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rapportRepository.save(rapport);
    }

    @GetMapping("/rapprt/type/{type}")
    public List<Rapport> getrapporttype(@PathVariable String type){
        return rapportRepository.findBytype(type);
    }
}

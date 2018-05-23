	package com.bramli.mongoexample.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.bramli.mongoexample.dao.VenteRepository;
import com.bramli.mongoexample.model.JoinUserVente;
import com.bramli.mongoexample.model.Vente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bramli.mongoexample.model.AppUser;
import com.bramli.mongoexample.dao.UserRepository;

@RestController
public class UserRestService {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/username/{nom}")
	public AppUser getByname(@PathVariable String nom){
		return userRepository.findBynom(nom);
	}
	@GetMapping("/usertel/{tel}")
	public AppUser getBytel(@PathVariable String tel){
		return userRepository.findBytel(tel);
	}
	@GetMapping("/user")
	public List<AppUser> getAllUser(){
		return userRepository.findAll();
	}
	@GetMapping("/user/{id}")
	public Optional<AppUser> getUser(@PathVariable Long id){//@PathVariable:You give Spring a value of "{john}" to the path variable loginName, so Spring get it with the "{}"
		return userRepository.findById(id);
	}
	@PostMapping("/user")
	public AppUser createUser(@Valid @RequestBody AppUser appUser){//@RequestBody:checher dans la requet http requperer les donne sou foramt json et ls enregistrer dans appUser


		return userRepository.save(appUser);
	}



	@DeleteMapping("/user/{id}")
	public boolean deleteuser(@PathVariable Long id){
		 userRepository.deleteById(id);
		 return true;
	}
	
	@PutMapping("/user/{id}")
	//@RequestMapping(value="/appUser/{id}",method=RequestMethod.PUT)
	public AppUser update(@PathVariable Long id, @Valid @RequestBody AppUser appUser){
		appUser.setId(id);
		return userRepository.save(appUser);
	}

}
	
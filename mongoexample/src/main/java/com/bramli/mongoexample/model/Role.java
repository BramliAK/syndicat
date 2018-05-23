package com.bramli.mongoexample.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Role {
	@Id
	private Long id;
	private String nom;
	//private List<Privilaige>Privilaige;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;

	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}


	

}

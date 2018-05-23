package com.bramli.mongoexample.model;

public class Adresse {
	private String block;
	private String appartement;
	private String type;
	public Adresse(String block, String appartement, String type) {
		super();
		this.block = block;
		this.appartement = appartement;
		this.type = type;
	}
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getAppartement() {
		return appartement;
	}
	public void setAppartement(String appartement) {
		this.appartement = appartement;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}

package com.lti.SpringBootApp2.model;

public class Product {

	Integer ID;
	String name;
	public Product(Integer iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product() {
		
		// TODO Auto-generated constructor stub
	}
	
}

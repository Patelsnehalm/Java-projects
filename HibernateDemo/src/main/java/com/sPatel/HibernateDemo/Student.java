package com.sPatel.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String city;
	private Certificate certy;
	
	


	public Student(int id, String name, String city, Certificate certy) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.certy = certy;
	}

	/*
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 */

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	public Certificate getCerty() {
		return certy;
	}

	public void setCerty(Certificate certy) {
		this.certy = certy;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", certy=" + certy + "]";
	}

	

}

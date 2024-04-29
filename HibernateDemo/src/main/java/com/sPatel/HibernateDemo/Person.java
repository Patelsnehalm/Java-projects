package com.sPatel.HibernateDemo;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
@Entity
public class Person {
	
	@Id
	@Column( length = 20,name="Name")
	private String name;
	@Column(name="Image")
	@Lob
	private byte[] image;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", image=" + Arrays.toString(image) + "]";
	}
	
	
	
	
	
	

}

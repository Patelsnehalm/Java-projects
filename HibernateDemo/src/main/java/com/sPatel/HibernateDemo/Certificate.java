package com.sPatel.HibernateDemo;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	
	private String Course;
	private String Duration;
	
	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Certificate [Course=" + Course + ", Duration=" + Duration + "]";
	}
	
	
	
	
	

}

package com.abc.SpringJDBC.dao;

import com.abc.SpringJDBC.entites.Student;

public interface StudentDao {
	
	public int insert(Student student);
	public int update(Student student);

}

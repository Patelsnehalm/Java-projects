package com.abc.SpringJDBC.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.abc.SpringJDBC.entites.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
   public int insert(Student student) {
		// TODO Auto-generated method stub
	    
		String query = "insert into student(id,name,city) values (?,?,? )"; 
		int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getAddress());
	    return r;
	}

   public int update(Student student) {
		// Updating Data
		String query="update student set name=?,city=? where id=? ";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getAddress(),student.getId());
		return r;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}

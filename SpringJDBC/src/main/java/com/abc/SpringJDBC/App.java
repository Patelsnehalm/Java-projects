package com.abc.SpringJDBC;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.abc.SpringJDBC.dao.StudentDao;
import com.abc.SpringJDBC.entites.Student;


public class App {
	public static void main(String[] args) {
		// System.out.println("Hello World!");

		// ApplicationContext context = new
		// AnnotationConfigApplicationContext(Config.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/abc/SpringJDBC/config.xml");
		//JdbcTemplate temp = context.getBean("jdbcTemplate", JdbcTemplate.class);
		
		//String query = "insert into student(id,name,city) values (?,?,? )";
		
		//int result = temp.update(query, 4, "Riya", "Katpur");
	//StudentDao studentDao=	(StudentDao) context.getBean("ds");
		StudentDao studentDao=(StudentDao) context.getBean("ds", StudentDao.class);
	Student s1=new Student();
	s1.setId(111);
	s1.setName("Sneh");
	s1.setAddress("Patan");
	
	
	int result=studentDao.insert(s1);
	System.out.println("Number of record inserted.." + result);

	}
}

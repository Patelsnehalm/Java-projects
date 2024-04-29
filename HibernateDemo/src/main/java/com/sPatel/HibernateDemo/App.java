package com.sPatel.HibernateDemo;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
      //  System.out.println(factory.isClosed());
        
        //Creating Student
        
        Student st=new Student();
       // st.setId();
        st.setName("Janvi");
        st.setCity("Mehsana");
        System.out.println(st);
        
        Person p=new Person();
        p.setName("Devang");
        
        FileInputStream fis=new FileInputStream("src/main/java/pic.jpg");
        byte [] data = new byte [fis.available()];
        fis.read(data);
        p.setImage(data);
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(st);
        session.save(p);
        tx.commit();
        session.close();
        
    }
}

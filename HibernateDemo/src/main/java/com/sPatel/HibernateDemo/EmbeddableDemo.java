package com.sPatel.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Student s = new Student();
		s.setName("Snehal");
		s.setCity("Vapi");

		Certificate cr = new Certificate();
		cr.setCourse("FSW");
		cr.setDuration("24 Months");

		s.setCerty(cr);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(s);
		tx.commit();
		session.close();

	}

}

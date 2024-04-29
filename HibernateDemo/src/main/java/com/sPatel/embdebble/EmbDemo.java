package com.sPatel.embdebble;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();


		Question q=new Question();
		q.setQueId(455);
		q.setQuestion("What is JAVA?");
		Answer a=new Answer();
		a.setAnsId(895);
		a.setAnswer("JAva is programing language!");
		q.setAnswer(a);
		

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(q);
		session.save(a);
		tx.commit();
		session.close();

	}

}

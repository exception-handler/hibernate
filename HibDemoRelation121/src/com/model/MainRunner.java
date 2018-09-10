package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainRunner {

	public static void main(String[] args) {
		
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory fac = cfg.configure().buildSessionFactory();
		Session session = fac.openSession();
		
		Transaction t = session.getTransaction();
		t.begin();
	
			System.out.println(" --- Start ---");
			InstructorDetails insDetails = new InstructorDetails("Chennai","www.linkedin\ramesh");
			
			Instructor instructor = new Instructor("ramesh","ramesh@gmail.com");
			instructor.setInstructorDetails(insDetails);
			
			session.save(instructor);
		
			System.out.println("All done");
		
		t.commit();
		session.close();
		
		
	}
}

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
	
		/*	System.out.println(" --- Start ---");
			InstructorDetails insDetails = new InstructorDetails("Pune","www.linkedin.com\\anil");
			
			Instructor instructor = new Instructor("anil","anil@gmail.com");
			instructor.setInstructorDetails(insDetails);
			
			session.save(instructor);
		
			System.out.println("All done");
		*/
		
		int sid = 20;
		InstructorDetails obj = (InstructorDetails)session.get(InstructorDetails.class,sid);
		
		System.out.println(obj);
		System.out.println("\n--------\n");
		
		Instructor insRef = obj.getInstructor();
		System.out.println(insRef);
		
		t.commit();
		session.close();
		
		
	}
}





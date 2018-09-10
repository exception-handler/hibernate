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
	
		
		Address a1_premanent = new Address("ABC-1091", "New Delhi", "Delhi");
		Address a2_premanent = new Address("XYZ-1091", "New Delhi", "Delhi");
		
		Address a1_present = new Address("ABC-1091", "Banglore", "Karnataka");
		Address a2_present = new Address("XYZ-1091", "Mumbai", "Maharastra");
		
		Instructor i1 = new Instructor("Ramesh","ramesh@gmail.com");
		Instructor i2 = new Instructor("Suresh","suresh@gmail.com");
		
		i1.setPermanentAddress(a1_premanent);
		i1.setPresentAddress(a1_present);

		i2.setPermanentAddress(a2_premanent);
		i2.setPresentAddress(a2_present);

		session.save(i1);
		session.save(i2);
		
		System.out.println("All done");
		
		t.commit();
		session.close();
		
		
	}
}

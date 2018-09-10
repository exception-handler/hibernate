package com.model;

import java.util.HashSet;
import java.util.Set;

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
	
		Course c1 = new Course("Core Java");
		Course c2 = new Course("Servlet and JSP");
		Course c3 = new Course("Hibernate");
		Course c4 = new Course("Spring");
		Course c5 = new Course("JAX-RS");
		Course c6 = new Course("React");
		Course c7 = new Course("SFDC");
		
		Set<Course> saurabhCourses = new HashSet<Course>();
		saurabhCourses.add(c1);
		saurabhCourses.add(c4);
		saurabhCourses.add(c5);
		saurabhCourses.add(c6);
		
		
		Set<Course> ashishCourses = new HashSet<Course>();
		ashishCourses.add(c2);
		ashishCourses.add(c3);
		ashishCourses.add(c7);
		ashishCourses.add(c1);
		
		
		Instructor i1 = new Instructor("saurabh", "saurabh@gmail.com",saurabhCourses);
		Instructor i2 = new Instructor("Ashish", "ashish@gmail.com",ashishCourses);
		
		session.save(i1);
		session.flush();
		session.save(i2);
		
		t.commit();
	
		session.close();
		System.out.println(" ---- Data Saved ");
		
	}
}

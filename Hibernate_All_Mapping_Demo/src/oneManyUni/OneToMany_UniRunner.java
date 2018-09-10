package oneManyUni;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class OneToMany_UniRunner {

	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Skills skill1 = new Skills("java",3,false);
		Skills skill2 = new Skills("Servlet",2,false);
		Skills skill3 = new Skills("sql",5,true);
		
		Set<Skills> set = new HashSet<Skills>();
		set.add(skill1);
		set.add(skill2);
		set.add(skill3);
		
		
		Student s = new Student();
		s.setCourse("IT");
		s.setStudentName("Ramesh");
		s.setSkills(set);
		
		
		session.save(s);
		
		t.commit();
		session.close();
		System.out.println(" --- All Done --- ");
	}
}

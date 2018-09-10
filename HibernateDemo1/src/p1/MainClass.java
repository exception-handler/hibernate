package p1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {

		MainClass obj = new MainClass();
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		
		obj.saveObject(session);
		//obj.getObject(session);
		//obj.getAllStudent(session);
		//obj.getAllStudentByCourse(session);
		//obj.updateStudent(session);
		//obj.deleteStudent(session);
		
		
		session.close();
		System.out.println("Session Close");
	
	}

	public void saveObject(Session session) {
		Transaction t = session.beginTransaction();

		Student s = new Student();
		s.setCourse("Python");
		s.setStudentName("Lokesh");
		s.setLocation("Mumbai");
		
		Address address = new Address("New Delhi", "ABC-123","Delhi");
		s.setAddress(address);
		
		session.save(s);
		t.commit();
		
	}

	public void getObject(Session session)
	{
		Transaction t = session.beginTransaction();
		Student s = (Student)session.get(Student.class, 21); 
		System.out.println(s);
		
		t.commit();
		
	}

	public void getAllStudent(Session session)
	{
		Transaction t = session.beginTransaction();
		
		List<Student> list = session.createQuery("from Student").list();
		
		for (Student student : list) {
			System.out.println(student);
		}
		
		t.commit();
	}
	
	public void getAllStudentByCourse(Session session)
	{
		Transaction t = session.beginTransaction();
		
		List<Student> list = session.createQuery("from Student where course like 'Python'").list();
		
		for (Student student : list) {
			System.out.println(student);
		}
		
		t.commit();
	}
	
	public void updateStudent(Session session)
	{
		Transaction t = session.beginTransaction();
		
		Student s = (Student) session.get(Student.class,0);
		System.out.println(s);
		s.setLocation("Boston");
		session.update(s);
		t.commit();
	}
	
	public void deleteStudent(Session session)
	{
		Transaction t = session.beginTransaction();
		
		Student s = (Student)session.get(Student.class,0);
		session.delete(s);
		
		t.commit();
	}
	
}










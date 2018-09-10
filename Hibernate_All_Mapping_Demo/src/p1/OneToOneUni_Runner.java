package p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class OneToOneUni_Runner {

	public static void main(String[] args) {
		
		StudentBGV bgv = new StudentBGV();
		bgv.setCompanyName("TRIG");
		bgv.setStatus(true);
		
		Student stu = new Student("test-user 2");
		stu.setBgvDetails(bgv);
		
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		session.save(stu);
		
		
		Student stuRead = (Student)session.get(Student.class, 1);
		System.out.println("-------->> Stu fetch : "+stuRead);
		t.commit();
		session.close();
		System.out.println(" --- All Done --- ");
	}

}

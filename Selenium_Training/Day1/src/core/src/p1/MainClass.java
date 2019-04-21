package p1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101, "rohit");
		System.out.println("object s1 created successfully "+s1);
		System.out.println(s1.hashCode());
		Student s2=new Student(102,"Mohit");
		System.out.println("object s2 created successfully "+s2);
		System.out.println(s2.hashCode());
		
		s1.play("rohit");
		s1.study("rohit");
		
		s2.play("Mohit");
		s2.study("Mohit");
		
	}

}

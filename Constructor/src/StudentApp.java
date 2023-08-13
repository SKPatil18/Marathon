
public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.id);
		Student s1 = new Student("Sunil");
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.id);
		Student s2 = new Student("Sunil",22);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.id);
		Student s3 = new Student("Sunil",22,18);
		System.out.println(s3.name);
		System.out.println(s3.age);
		System.out.println(s3.id);
		
		s1.display();
	}

}


public class Student {
	String name;
	int age;
	int id;
	
	Student(){
		name = "Sunil";
		age = 22;
		id = 18;
	}
	Student(String name){
		this.name = name;
		age = 22;
		id = 18;
	}
	Student(String name,int age){
		this.name = name;
		this.age = age;
		id = 18;
	}
	Student(String name,int age,int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	 void display() {
		System.out.println("Student information");
	}
	 static{
		 System.out.println("Student Information");//displayed first
	 }
	

}

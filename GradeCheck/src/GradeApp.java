import java.util.Scanner;

public class GradeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student Marks");
		int marks = scan.nextInt();
		gradeCheck(marks);
	}
	public static  void gradeCheck(int grade) {
		if(grade>50) {
			System.out.println("The Student is passed");
		}else {
			System.out.println("The Student is Failed");
		}
	}

}

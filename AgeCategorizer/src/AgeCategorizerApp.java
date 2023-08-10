import java.util.Scanner;

public class AgeCategorizerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age");
		int age = scan.nextInt();
		categorizeAge(age);
	}
	
	public static void categorizeAge(int age) {
		if(age>0 && age<=12) {
			System.out.println("Child");
		}
		else if(age>=13 && age<=19) {
			System.out.println("Teen");
		}
		else if(age>=20 && age<=59) {
			System.out.println("Teen");
		}
		else if(age>=60){
			System.out.println("Senior");
		}else {
			System.out.println("Please Enter the correct age");
		}
	}

}

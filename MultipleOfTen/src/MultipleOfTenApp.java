import java.util.Scanner;

public class MultipleOfTenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 Number");
		int n=scan.nextInt();
		int m=scan.nextInt();

		
		checkMultipleOfTen(n,m);
	}
	/*public static void checkMultipleOfTen(int n) {
		if(n%10==0) {
			System.out.println("Entered Number is Multiple of 10");
		}else {
			System.out.println("Entered Number is Not a Multiple of 10");

		}
	}*/
	public static void checkMultipleOfTen(int n,int m) {
		if(n%m==0) {
			System.out.println("Entered Number "+n+" is Multiple of "+m);
		}else {
			System.out.println("Entered Number "+n+" is not Multiple of "+m);

		}
	}

}

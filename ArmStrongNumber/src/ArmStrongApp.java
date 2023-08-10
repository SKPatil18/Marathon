import java.util.Scanner;

public class ArmStrongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check ArmStrong Number: ");
		int n= scan.nextInt();
		ArmStrong armstrong = new ArmStrong();
		int res = armstrong.armStrongChecker(n);
		//System.out.println(res);
		if(res==n) {
			System.out.println("ArmStrong Number");
		}else {
			System.out.println("Not an ArmStrong Number");

		}

	}

}

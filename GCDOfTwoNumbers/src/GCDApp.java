import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int m= scan.nextInt();
		int n = scan.nextInt();
		//GCD gcd = new GCD();
		//int res = gcd.findGCD(m, n);
		int res = GCD.findGCD(m, n);
		System.out.println("GCD of "+m+" AND "+n+"is "+res);

	}

}

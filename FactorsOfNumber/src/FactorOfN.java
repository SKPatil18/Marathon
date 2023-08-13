import java.util.Scanner;

public class FactorOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		System.out.println("The Factors of "+n+" are");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}

	}

}

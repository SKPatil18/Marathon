import java.util.Scanner;

public class NumberReversalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = scan.nextInt();
		int rev=0;
		while(num!=0) {
			int rem = num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);

	}

}

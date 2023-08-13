import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n=scan.nextInt();
		calculateSumOfDigits(n);


	}
	public static void calculateSumOfDigits(int n) {
		// your code here
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
		
	}


}

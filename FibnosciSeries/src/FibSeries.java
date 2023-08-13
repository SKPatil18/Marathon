import java.util.Scanner;

public class FibSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n= scan.nextInt();
		printSeries(n);
		
				

	}
	public static void printSeries(int n) {
		int fib1 =0;
		int fib2 =1;
		if(n==1) {
			System.out.println(fib1+" ");
		}
		else if(n==2) {
			System.out.println(fib1+" "+fib2);
		}
		else {
			System.out.print(fib1+" "+fib2+" ");
			for(int i=3;i<=n;i++) {
				int nextNo=fib1+fib2;
				System.out.print(nextNo+" ");
				fib1=fib2;
				fib2=nextNo;
			}
		}
	}

}

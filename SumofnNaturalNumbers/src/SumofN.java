import java.util.Scanner;

public class SumofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int num = scan.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum = sum+i;
		}
		System.out.println("Sum of first "+num+" Natural Numbers is "+sum);
	

	}

}

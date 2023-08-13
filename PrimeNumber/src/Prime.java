import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range of prime numbers to print ");
		int num = scan.nextInt();
		int count = 0;
		for(int i=3;i<=num;i++) {
			boolean res = checkPrime(i);
			if(res) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Number of prime numbers are :"+count);
		/*int n = scan.nextInt();
		if(n<=2) {
			System.out.println("Not a prime number ");
		}
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		if(sum%n==0) {
			System.out.println("Prime Number");
		}*/
		
	}
	
	public static boolean checkPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}

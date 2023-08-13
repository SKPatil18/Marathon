import java.util.Scanner;

public class FriendlyPairsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two  Number :");
		int n =scan.nextInt();
		int m =scan.nextInt();
		int nSum = FriendlyPairsApp.sumOfDivisors(n)/n;
		int mSum = FriendlyPairsApp.sumOfDivisors(m)/m;
		//System.out.println(nSum);
		//System.out.println(mSum);
		if(nSum == mSum) {
			System.out.println("Entered Numbers are Friendly Pairs");
		}else {
			System.out.println("Entered Numbers are not Friendly Pairs");
		}
		

		

	}
	
	public static int sumOfDivisors(int n) {
		int sum=0;
		int i=1;
		while(i<=n) {
			if(n%i==0) {
				sum=sum+i;
			}
			i++;
		}
		//System.out.println(sum);
		return sum;
	}

}

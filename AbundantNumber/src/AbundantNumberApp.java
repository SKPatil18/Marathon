import java.util.Scanner;

public class AbundantNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = scan.nextInt();
		AbundantNumberApp an = new AbundantNumberApp();
		boolean res = an.checkAbundant(n);
		if(res) {
			System.out.println("Entered Number is Abundant Number :");
		}else {
			System.out.println("Entered Number is Not Abundant Number or Deficient Number :");

		}

	}
	public boolean checkAbundant(int n) {
		int i=1;
		int sum=0;
		while(i<n) {
			if(n%i==0) {
				sum=sum+i;
			}
			i++;
		}
		if(sum>n) {
			return true;
		}
		return false;
	}

}

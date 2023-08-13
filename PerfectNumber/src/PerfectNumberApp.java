import java.util.Scanner;

public class PerfectNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scan.nextInt();
		PerfectNumber pefectNumber  = new PerfectNumber();
		int res = pefectNumber.checkPerfecct(n);
		if(res==n) {
			System.out.println("Entered Number is Perfect Number");
		}else {
			System.out.println("Entered Number is Not a Perfect Number");
		}

	}

}

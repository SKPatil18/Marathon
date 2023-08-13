import java.util.Scanner;

public class DiscountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter purchase amount");
		double pamt = scan.nextDouble();
		Discount.discountApplicable(pamt);
		

	}

}

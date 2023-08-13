import java.util.Scanner;

public class StrongNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scan.nextInt();
		StrongNumber sn = new StrongNumber();
		int res = sn.checkStrongNumber(num);
		if(res==num) {
			System.out.println("Entered Number is Strong Number");
		}else {
			System.out.println("Entered Number is Not a Strong Number");

		}

		
//      First 4 strong numbers
//		int j=1;
//		int i=1;
//		while(j<=5) {
//			int res = sn.checkStrongNumber(i);
//			if(res==i) {
//				System.out.println(res);
//				j++;
//			}
//			i++;
//			
//		}

		
//		To check Strong Number in range
//		for(int i=0;i<=100;i++) {
//			int res = sn.checkStrongNumber(i);
//			if(res==i) {
//				System.out.println("Strong Number "+i);
//			}
//		}

	}

}

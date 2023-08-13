import java.util.Scanner;

public class HarshadNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=scan.nextInt();
		if(HarshadNumberApp.checkHarshad(n)) {
			System.out.println("Entered Number is Harshad Number");
		}else {
			System.out.println("Entered Number is Not Harshad Number");

		}
		//within Range
//		for(int i=1;i<=100;i++) {
//			
//			if(HarshadNumberApp.checkHarshad(i)) {
//				System.out.println(i);
//			}
//		}
		
	}
	public static boolean checkHarshad(int n) {
		int sum=0;
		int num = n;
		while(n!=0) {
			int temp = n%10;
			sum=sum+temp;
			n=n/10;
		}
		if(num%sum==0){
			return true;
		}
		return false;
	}

}

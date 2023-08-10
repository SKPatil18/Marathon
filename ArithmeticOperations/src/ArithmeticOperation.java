import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int res1 = subtractNumbers(num1,num2);
		System.out.println(res1);
		int res2 = multiplyNumbers(num1,num2);
		System.out.println(res2);
		double res3 = divideNumbers(num1,num2);
		System.out.printf("%.2f\n",res3);
		int res4 = findRemainder(num1,num2);
		System.out.println(res4);

	}
	public static int subtractNumbers(int num1, int num2) {
		return num1-num2;
	}
	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
	}
	public static double divideNumbers(int num1, int num2) {
		return num1/num2;
	}
	public static int findRemainder(int num1, int num2) {
		return num1%num2;
	}

}

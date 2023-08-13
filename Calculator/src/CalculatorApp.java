import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		while(true) {
			System.out.println("Hello user welcome to Kodnest Calculator");
			System.out.println("+ - Addition");
			System.out.println("- Subtraction");
			System.out.println("* - multiplication");
			System.out.println("/ - Division");
			System.out.println("% - findReminder");
			System.out.println("^ - findSquare");
			System.out.println("! - stop");
			System.out.println("Enter your choice");
			
			Scanner scan = new Scanner(System.in);
			char ope = scan.next().charAt(0);
			if(ope=='!') {
				return;
			}
			System.out.println("Enter two numbers");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			switch(ope) {
			case '+':
				
				System.out.println(Calculator.addition(num1,num2));
				break;
			case '-':
				System.out.println("Enter two numbers");
				
				System.out.println(Calculator.subtraction(num1,num2));
				break;
			case '*':
				System.out.println("Enter two numbers");
				
				System.out.println(Calculator.multi(num1,num2));
				break;
				
			case '/':
				System.out.println("Enter two numbers");
				
				System.out.println(Calculator.division(num1,num2));
				break;
				
			case '%':
				System.out.println("Enter two numbers");
				
				System.out.println(Calculator.findReminder(num1,num2));
				break;
				
			case '^':
				System.out.println("Enter two numbers");
				System.out.println(Calculator.findSquare(num1));
				break;
				
				

			}
			
		}

	}

}

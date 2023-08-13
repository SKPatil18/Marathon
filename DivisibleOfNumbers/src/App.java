import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of N ");
		int n = scan.nextInt();
		System.out.println("Numbers Divisible by 2 are :");
		DivisibleByTwo.divByTwo(n);
		System.out.println();
		System.out.println("Numbers Divisible by 3 are :");
		DivisibleByThree.divByThree(n);
		System.out.println();
		System.out.println("Numbers Divisible by 5 are :");
		DivisibleByFive.divByFive(n);
		System.out.println();
		System.out.println("Numbers Divisible by 2 and 5 are :");
		DivisibleByTwoAndFive.divisibleByTwoAndFive(n);
		System.out.println();
		System.out.println("Prime Numbers :");
		for (int i = 2; i < n; i++) {
			boolean res = DisplayPrimeNumbers.displayPrimeNumbers(i);
			if(res) {
				System.out.println(i);
			}
		}
		System.out.println();
		System.out.println("Display all even Numbers Divisible by 3 :");
		EvenNumDivisibleByThree.evenNumDivisibleByThree(n);

		
		
	}

}

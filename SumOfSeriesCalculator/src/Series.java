import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n=scan.nextInt();
		SumOfSeries.calculateSumOfSeries(n);

	}

}

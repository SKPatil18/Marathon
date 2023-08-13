
public class FinanceCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinanceCalculator calculator = new FinanceCalculator();

		System.out.printf("%.2f",calculator.calculateSimpleInterest(1000.0, 0.05, 2.0));
	}

}


public class DivisibleByTwoAndFive {
	public static void divisibleByTwoAndFive(int n) {
		for (int i = 1; i <=n; i++) {
			if(i%2==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}
}

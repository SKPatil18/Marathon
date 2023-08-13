
public class EvenNumDivisibleByThree {
	public static void evenNumDivisibleByThree(int n) {
		for (int i = 1; i <=n; i++) {
			if(i%2==0 && i%3==0) {
				System.out.println(i);
			}
			System.out.println(i%2==0 && i%3==0?i:"");
			
		}
	}

}

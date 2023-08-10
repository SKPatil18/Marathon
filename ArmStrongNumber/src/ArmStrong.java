
public class ArmStrong {
	public int armStrongChecker(int n) {
		double sum=0;
		while(n!=0) {
			int rem = n%10;
			sum=sum+Math.pow(rem, 3);
			n=n/10;
		}
		return (int)sum;
	}

}


public class StrongNumber {
	public int checkStrongNumber(int num) {
		int sum=0;
		while(num!=0) {
			int rem = num%10;
			sum=sum+fact(rem);
			num = num/10;
		}
		return sum;
	}
	
	public int fact(int n) {
		int factSum = 1;
		for(int i=1;i<=n;i++) {
			factSum=factSum*i;
		}
		return factSum;
	}
	

}

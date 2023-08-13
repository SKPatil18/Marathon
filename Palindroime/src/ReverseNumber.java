
public class ReverseNumber {
	public int  reverseNum(int n) {
		int originalNum = n;
		int rev=0;
		while(n!=0) {
			int rem = n%10;
			rev = rev*10+rem;
			n=n/10;
		}
		return rev;
		
	}
	
}

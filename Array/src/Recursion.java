
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(5);

	}
	public static void sum(int n) {
		if(n==0) {return;}
		System.out.println(n);
		sum(n-1);
	}	

}

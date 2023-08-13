import java.util.Scanner;

public class AutoMorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scan.nextInt();
		AutoMorphic autoMorphic = new AutoMorphic();
		boolean res = autoMorphic.checkautoMorphic(n);
		if(res) {
			System.out.println("Entered Number is AutoMorphic ");
		}else {			
			System.out.println("Entered Number is Not AutoMorphic ");
		}

		
	}
	
	public boolean checkautoMorphic(int n) {
		int sqrNum = n*n;
		boolean res;
		while(n!=0) {
			if(n%10!=sqrNum%10) {
				return false;
			}
			n=n/10;
			sqrNum=sqrNum/10;
		}
		return true;
	}

}

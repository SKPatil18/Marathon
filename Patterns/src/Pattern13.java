
public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i+j);
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		

	}

}


public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int k=1;k<=n;k++) {
			for(int i=1;i<=n-k;i++) {
				System.out.print(" ");
			}
			for(int j=1; j<=k;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

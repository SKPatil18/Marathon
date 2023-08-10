import java.util.Scanner;

public class GJArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		Scanner scan = new Scanner(System.in);
		String str[][] = new String[6][];
		str[0] = new String[2];
		str[1] = new String[7];
		str[2] = new String[3];
		str[3] = new String[2];
		str[4] = new String[4];
		str[5] = new String[5];
		
		for(int i=0;i<=str.length-1;i++) {
			for(int j=0;j<=str[i].length-1;j++) {
				System.out.println("Enter bank "+i+" costumer "+j+" name");
				str[i][j] = scan.next();
			}
		}
		System.out.println("------");
		for(int i=0;i<=str.length-1;i++) {
			
			for(int j=0;j<=str[i].length-1;j++) {
				System.out.print(" bank "+i+" costumer "+j+" name is : ");

				System.out.println(str[i][j]);
			}
		}

	}

}

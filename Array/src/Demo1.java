import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float arr[][] = new float[4][3];
		for(int i=0;i<=arr.length-1; i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter game "+i+" player "+j+" height");
				arr[i][j] = scan.nextFloat();
			}
			System.out.println();
		}
		for(int i=0;i<=arr.length-1; i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}

	}

}

import java.util.Scanner;

public class GameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of games :");
		
;		int arr[][] = new int[scan.nextInt()][];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter number of players in game "+i);
			arr[i]= new int[scan.nextInt()];		
		}
		
	
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter game "+i+" player "+j+" score");
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println("---------------------");
		for(int i=0;i<=arr.length-1;i++) {
		
			
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(" Game "+i+" player "+j+" score is : ");

				System.out.println(arr[i][j]);
			}
		}

	}

}

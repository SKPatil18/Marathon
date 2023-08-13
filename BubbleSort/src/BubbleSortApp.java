import java.util.Scanner;

public class BubbleSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array :");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter array elements :");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		BubbleSortDecs bs = new BubbleSortDecs();
		int res[] = bs.sortArray(arr);
		System.out.println("Sorted Elements are :");
		for(int i:res) {
			System.out.print(i+" ");
		}

	}

}

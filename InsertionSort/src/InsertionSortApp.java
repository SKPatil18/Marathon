import java.util.Scanner;

public class InsertionSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array length :");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter Array Elements :");
		for(int  i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(arr);
		System.out.println("Sorted Elements are :");
		for(int i:arr) {
			System.out.println(i+" ");
		}

	}

}

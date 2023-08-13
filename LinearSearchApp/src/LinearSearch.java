import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array :");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the array Elements:");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter Element to search :");
		int key = scan.nextInt();
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i] == key) {
				System.out.println("Element found at index "+i);
				return;
			}
		}
		System.out.println("Element not found");

	}

}

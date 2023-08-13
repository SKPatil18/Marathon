import java.util.Scanner;

public class BinarySearchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter array elements :");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter an Element to Search ");
		int element = scan.nextInt();
		BinarySearch bs = new BinarySearch();
		int res = bs.searchElement(arr, element);
		if(res>=0) {
			System.out.println("Element found at index "+ res);
		}else {
			System.out.println("Element not found");
		}
		

	}

}

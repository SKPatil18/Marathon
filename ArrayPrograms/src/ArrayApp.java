import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter array Elements :");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Array After Replacing Negative Elements :");
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<=0) {
				arr[i] = 0;
			}
		}
		for(int i : arr) {
			System.out.println(i);
		}
	}

}

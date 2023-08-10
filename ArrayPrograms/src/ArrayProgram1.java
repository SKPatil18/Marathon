import java.util.Scanner;

public class ArrayProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter array elements :");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(" array elements are :");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		for(int i:arr) {
			System.out.println(i);
		}
	}
 
}

import java.util.Scanner;

public class ArrayProgram2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter array elements :");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Array contents are :");
		for(int i:arr) {
			System.out.println(i+5);
		}
	}
}

import java.util.Scanner;

public class SumOfArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array 1 Length");
		int arr1[] = new int[scan.nextInt()];
		int arr2[] = new int[arr1.length];
		System.out.println("Enter array 1 elements");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i] = scan.nextInt();
		}
		System.out.println("Enter array 2 elements");
		for(int i=0;i<=arr1.length-1;i++) {
			arr2[i] = scan.nextInt();
		}
		
		int res[] = SumOfArray.arraySum(arr1, arr2);
		System.out.println("sum of array elements are :s");
		for(int i:res) {
			System.out.println(i);
		}
		
		

	}

}

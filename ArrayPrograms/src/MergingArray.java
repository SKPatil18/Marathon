import java.util.Scanner;

public class MergingArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of First Array");
		int len1 = scan.nextInt();
		System.out.println("Enter the length of Second Array");
		int len2 = scan.nextInt();
		int arr1[] = new int[len1];
		int arr2[] = new int[len2];
		System.out.println("Enter First Array Elements :");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i] = scan.nextInt();
		}
		System.out.println("Enter Second Array Elements :");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i] = scan.nextInt();
		}
		int arr3[] = new int[len1+len2];
		
		System.out.println("Array after Merging :");
		for(int i=0;i<=arr1.length-1;i++) {
			arr3[i] = arr1[i];
		}
//		for(int i=0;i<=arr1.length-1;i++) {
//			System.out.println(arr3[i]);
//		}
		for(int i=arr1.length,j=0;i<=arr3.length-1;i++,j++) {
			
			arr3[i] = arr2[j];
		}
		for(int i=0;i<=arr3.length-1;i++) {
			System.out.println(arr3[i]);
		}
		
		
	}

}

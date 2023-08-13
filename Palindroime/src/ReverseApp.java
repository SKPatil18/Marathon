import java.util.Scanner;

public class ReverseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scan.nextInt();
		ReverseNumber reverse = new ReverseNumber();
		int rev = reverse.reverseNum(n);
		System.out.println(rev);
		if(n==rev) {
			System.out.println("Number is Palindroime");
		}else {
			System.out.println("Number is Not Palindroime");
		}
		
		
//		int count=0;
//		int rev;
//		System.out.println("Enter array length");
//		int arr[] = new int[scan.nextInt()];
//		System.out.println("Enter array elements");
//		for(int i=0;i<=arr.length-1;i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		System.out.println("Palindrone numbers are");
//		for(int i=0;i<arr.length;i++) {
//			int temp = arr[i];
//			rev = reverse.reverseNum(arr[i]);
//			if(temp==rev) {
//				System.out.println(rev);
//				count++;
//			}
//		}
//		System.out.println("Total palindrome number is array is "+count);
		
	}

}

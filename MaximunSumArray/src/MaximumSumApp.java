import java.util.Scanner;

public class MaximumSumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array Length :");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter array Elements :");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		int sum=0;
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>=0) {
				sum=sum+arr[i];
				count++;
			}
		}
		System.out.println("The maximum sum of subset array is "+sum);
		System.out.println("Number of Elements in array are "+count);

	}

}

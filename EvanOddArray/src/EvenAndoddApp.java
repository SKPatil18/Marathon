import java.util.Scanner;

public class EvenAndoddApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length :");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter array Elements :");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		int index = 0;
		int res[] = new int[arr.length];

		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
				res[index] = arr[i];
				index++;
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2!=0) {
				res[index] = arr[i];
				index++;
			}
		}
		for(int i : res) {
			System.out.println(i+" ");
		}

	}

}

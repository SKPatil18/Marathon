import java.util.Arrays;

public class CopyOfRange {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60};
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("---------");
		
		int[] copy = Arrays.copyOfRange(arr,0,3);
		for(int i=0;i<=copy.length-1;i++) {
			System.out.println(copy[i]);
		}
	}

}

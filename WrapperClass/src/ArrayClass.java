import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30};
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("---------");
		
		int[] copy = Arrays.copyOf(arr,arr.length);
		for(int i=0;i<=copy.length-1;i++) {
			System.out.println(copy[i]);
		}
	}

}

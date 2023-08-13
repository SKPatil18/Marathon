
public class BinarySearch {
	public int searchElement(int arr[],int key) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(key == arr[mid]) {
				//System.out.println("Key Found");
				return mid;
			}
			else if(key>arr[mid]) {
				low = mid+1;
			}else if(key<arr[mid]) {
				high = high-1;
			}
			
		}
		return -1;
	}

}


public class SelectionSortingTechniques {
	
	public void insertionSort(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			int item = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
	}
	
	public int[] bubbleSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		return arr;
		
	}
	
	public void selectionSort(int arr[]) {
		int min;
		int pos;
		int i;
		int j;
		for(i=0;i<=arr.length-2;i++) {
			min = arr[i];
			pos = i;
			for(j=i+1;j<=arr.length-1;j++) {
				if(arr[j]<min) {
					min = arr[j];
					pos = j;
				}
				
			}
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
			
		}
	}
	
	public int linearSearch(int arr[], int key) {
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i] == key) {
				
				return i;
			}
		}
		return -1;
	}
	
	
	public int searchElement(int arr[],int key) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(key == arr[mid]) {
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















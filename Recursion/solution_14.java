import java.util.Arrays;

public class quick_sort {

	public static void main(String[] args) {
		
		int[] arr = {89,24,1,78};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	
	private static void quickSort(int[] arr, int low, int hi) {
		
		if(low>=hi) return;
		
		// 'low' & 'hi' will remain as it is and 'start' & 'end' will be incremented to find pivot
		int start = low;
		int end = hi;
		int mid = start+(end-start)/2;  // index of pivot
		int pivot = arr[mid];  // pivot element
		
		while(start<=end) {
			
			while(arr[start]<pivot) {
				start++;
			}
			
			while(arr[end]>pivot) {
				end--;
			}
			
			if(start<=end) {
				int temp = arr[start];
				arr[start]= arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
		// now pivot is at correct index, now sort other halves.
		quickSort(arr,low,end);
		quickSort(arr,start,hi);
		
	}


  // Worst case time complexity: O(n2)
  // Best case time complexity: O(nlogn)
  // Space Complexity: O(1)
}

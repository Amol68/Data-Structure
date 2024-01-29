import java.util.Arrays;

public class merge_sort {

	public static void main(String[] args) {
		
		int arr[] = {25,7,23,9,45};
		int[] sorted_array=(mergeSort(arr));
		System.out.println(Arrays.toString(sorted_array));
	}
	
	private static int[] mergeSort(int[] arr) {
		
		if(arr.length==1) return arr;
		
		
		int mid= arr.length/2;
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left,right);
	}


	private static int[] merge(int[] first, int[] second) {
		
		int[] mix = new int[first.length+second.length];
		int i=0; int j=0; int k=0;
		
		while(i<first.length && j<second.length) {
			
			if(first[i]<second[j]) {
				mix[k]=first[i];
				i++;
			}
			else {
				mix[k]=second[j];			
			     j++;
			}
			k++;  
			     }
		
		  while(i<first.length) {
			  mix[k]=first[i];
			  i++; k++;
		  }
		  
		  while(j<second.length) {
			  mix[k]=second[j];
			  j++; k++;
		  }
		return mix;
		}
	
		
	}


//Time Complexity = bigO(nlogn)
// Space Complexity = BigO(n)

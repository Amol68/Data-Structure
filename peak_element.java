import java.util.*;

public class peak_element {
	
	@SuppressWarnings("unused")
	public static int find_peak(int arr[], int n)
	{
		if(n==1)
		{ 
			System.out.println("Peak:" +arr[0]);
			return 0;
		}
		
		else if(arr[0]>=arr[1])
		{
			System.out.println("Peak:" +arr[0]);
			return 0;	
		}
		
		else  if(arr[n-1]>=arr[n-2])
		{
			
				System.out.println("Peak:" +arr[n-1]);
				return n-1;	
			
				
		}
		
		for(int i=1; i<n-1; i++)
		{
			if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
			return i;	
		}
		return 0;
	}

	public static void main(String[] args) {
		
		
		int arr[] = {2,78,11,90,65};
		int n = arr.length;
		System.out.print("Index of a peak point is " + find_peak(arr, n));
	    
		
	}

}

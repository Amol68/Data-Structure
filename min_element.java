
public class min_element {

	public int find_min(int[] arr)
	{
		if(arr.length==0)
		{
			System.out.println("Empty Array!");
		}
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		return min; 
	}
	public static void main(String[] args) {
		
		int arr1[] = {1,9,0,4,5};
		
		min_element m1 = new min_element();
		System.out.println("Minimum Value:" +m1.find_min(arr1));
		
		
	}
	
	
}

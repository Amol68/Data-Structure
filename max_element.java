
public class max_element {

	
	public int find_max(int[] arr)
	{
		if(arr.length==0)
		{
			System.out.println("Empty Array!");
		}
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max; 
}
public static void main(String[] args) {
		
		int arr1[] = {1,9,0,4,5};
		
		max_element m1 = new max_element();
		System.out.println("Max Value:" +m1.find_max(arr1));
	
}
}

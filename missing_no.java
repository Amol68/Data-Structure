
public class missing_no {

	
	public static int find_no(int[] arr)
	{
		int n = arr.length+1;
		int sum= n*(n+1)/2;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum-arr[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		missing_no obj1 = new missing_no();
		int[] arr = new int[] {1,2,3,4,6,5,8,9,10,11};	
		
		int result = obj1.find_no(arr);
		
		System.out.println("Missing No:" +result);
	}
	
	
}

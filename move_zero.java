
public class move_zero {

	
	static public void print_array(int[] arr1)
	{
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
	
	}

	
	 public void array_demo()
	{
		int array[] = {0,3,0,6,9};
		print_array(array);
		move_Zero(array,array.length);
		System.out.println("Resultant Array:");
		print_array(array);
	}
	
	
	
	
	public void move_Zero(int[] arr1,int n)
	{
		int j=0;
		
		for(int i=0; i<n;i++)
		{
			if(arr1[i]!=0 && arr1[j]==0)
			{
				int temp = arr1[i];
				arr1[i]=arr1[j];
				arr1[j]=temp;
			}
			if(arr1[j]!=0) {
				j++;
	       }
		}
		
	}
	

	public static void main(String[] args) {
		
		 move_zero a1 = new  move_zero();
		 a1.array_demo();
		
		 
		
	}

}

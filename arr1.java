
public class arr1 {

	public void arrinit()
	{
		int[] arr = new  int[5];
	
		arr[0]=10;
		arr[1]=11;
		arr[2]=12;
		arr[3]=13;
		arr[4]=14;
		
		printarray(arr);
	}
	
	public void printarray(int[] arayparam)
	{
		int n = arayparam.length;
		
		for(int i=0; i<n; i++)
		{
			System.out.println(+arayparam[i]);
		}
		
		
	}
	
	public static void main(String[] args) 
	{
      arr1 a1 = new arr1();
      a1.arrinit();
	}

}

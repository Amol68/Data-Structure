import java.util.Scanner;
public class remove_even_int {
	
	static public void print(int[] arr1)
	{
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
	}
	
	static int[] remove_even(int[] arr1)
	{
		int oddcount=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2!=0)
			{
				oddcount++;
			}
		}
		
		int[] result= new int[oddcount];
		int idx=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2!=0)
			{
				result[idx]=arr1[i];
				idx++;
			}
		}
		return result;
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Array Size:");
		int size = sc.nextInt();
		
		
		int[] arr= new int[size];
		
		
		System.out.print("Enter Array Elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array before removing even numbers: ");
		print(arr);
		 System.out.println("\nArray after removing even numbers: ");
		int[] res = remove_even(arr);
		print(res);
	}

}

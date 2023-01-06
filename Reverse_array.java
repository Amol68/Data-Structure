import java.util.Scanner;

public class Reverse_array {

	static public void print(int[] arr1)
	{
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
	}
	
	
	static void reverse(int[] arr,int start,int end)
	{
		while(start<end)
		{
		int temp = arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
		}
		
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
		
		System.out.println("Array before: ");
		print(arr);
		
		reverse(arr,0,arr.length-1);
		System.out.println("Array After: ");
		print(arr);

	}

}

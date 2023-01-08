
public class resize_array {

	static public void print_array(int[] arr1)
	{
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
	
	}
	
	public int[] resize(int[] array , int capacity)
	{
		int[] temp = new int[capacity]; 
		
		for(int i = 0; i<array.length; i++)
		{
			temp[i]=array[i];
		}
		array = temp;
		return array;
	}
	
	public static void main(String[] args) {
		
		resize_array obj1 = new resize_array();
		
		int[] a1 = new int[]{2,2,7,5,9};
		System.out.println("Original Array Size:" +a1.length);
		
		a1=obj1.resize(a1, 10);
		System.out.println("New Array Size:" +a1.length);
			
	}
	
}

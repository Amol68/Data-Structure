
public class second_max {

	
 int find_sec_max(int[] arr)
 {
	 int max_1 = Integer.MIN_VALUE;
	 int max_2 = Integer.MIN_VALUE;
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]>max_1)
		 {
			 max_2=max_1;
			 max_1=arr[i];
		 }
		 else if(arr[i]>max_2 && arr[i]!=max_1)
		 {
			max_2=arr[1]; 
		 }
	 }
	 
	 return max_2;
 }
	
	public static void main(String[] args) {
		

		int arr1[] = {1,0,5,4,8};
		
		second_max f1 = new second_max();
		System.out.println("Max Value:" +f1. find_sec_max(arr1));
		
		
	}

}

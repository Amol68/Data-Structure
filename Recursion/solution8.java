
public class linear_search {

	public static void main(String[] args) {
		
		int arr[]= {23,56,89,100,123,234};
		int target=23;
		
		System.out.println(find(arr,target,0));
	}
	
	static boolean find(int[] arr,int target, int index) {
		
		if(index==arr.length) {
			return false;
		}
		
		return arr[index]==target || find(arr,target,index+1);  
	}

}

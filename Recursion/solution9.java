
public class isSorted {

	public static void main(String[] args) {
		
		int[] arr = {2,4,6,99,12,45,78};
		System.out.println(sorted(arr,0));

	}
	
	static boolean sorted(int[] arr, int index) {
		
		if(index==arr.length-1) {
			return true;
		}
		
		return arr[index]<arr[index+1] && sorted(arr,index+1);
	}

}

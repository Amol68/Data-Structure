
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

// ------->------->------->------->------->------->------->------->------->------->------->------->------->------->------->------->------->

//returning an arraylist of indices

import java.util.ArrayList;

class HelloWorld {
    
    public static void main(String[] args) {
      
      int[] arr = {2,7,9,13,7,90};
      System.out.println(searchAll(arr,7,0,new ArrayList()));
    }
    
    public static ArrayList searchAll(int[] arr,int target,int index,ArrayList<Integer> list){
        
        if(index==arr.length) return list;
        
        if(arr[index]==target) list.add(index);
        
        return searchAll(arr,target,++index,list);
    }
}

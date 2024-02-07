import java.util.Arrays;

class HelloWorld {
    public static void main(String[] args) {
       
       int[] arr = {12,8,11,67,45,99,21,34,0,34,76};
       int min =Integer.MAX_VALUE;
       int ans = find_min(arr,min);
       System.out.println(ans);
      
    }
    
    private static int find_min(int[] arr, int min){
    
    if(arr.length<1) return min;
    
    if(min>arr[arr.length-1]){
        min = arr[arr.length-1];
    return find_min(Arrays.copyOfRange(arr,0,arr.length-1),min);
    }
    
    else{
        return find_min(Arrays.copyOfRange(arr,0,arr.length-1),min);
    }
        
    }
    
    
}

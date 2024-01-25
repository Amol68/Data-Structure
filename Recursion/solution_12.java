import java.util.Arrays;
class HelloWorld {
    
    static void print(int[] arr,int r, int c){

    if(r==0)return;
    
        if(c<r){
           
           if(arr[c]>arr[c+1]){
               int temp = arr[c];
               arr[c]=arr[c+1];
               arr[c+1]=temp;
           }
           
            print(arr,r,c+1); 
            }
            else
             print(arr,r-1,0);
        
    }
    
    public static void main(String[] args) {
      
      int[] arr = {35,17,9,76,4};
      print(arr,arr.length-1,0);
      System.out.println(Arrays.toString(arr));
        
    }
}


//Best Case & Worst Case Comploexity: O(n2)
// Stable: No
//Space Complexity: O(1)

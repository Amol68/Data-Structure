import java.util.Arrays;

public  class demo{
    static void selection(int[] arr, int r, int c, int max){
        
        if(r==0) return;
        
        if(c<r){
            
            if(arr[max]<arr[c]) selection(arr,r,c+1,c);
            else selection(arr,r,c+1,max);
        }
        else{
            int temp = arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selection(arr,r-1,0,0);
        }
        
    }
    
    public static void main(String[] args){
         int[] arr = {67,3,97,3,7};
         selection(arr,arr.length,0,0);
         System.out.println(Arrays.toString(arr));
    }
}

// best case & worst case complexity: bigO(n2)
// space complexity : bigO(1);
// stable : no

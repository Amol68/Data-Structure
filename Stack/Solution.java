import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       
       int arr[] = {6,4,9,12,11,55};
       int next_greater[] = new int[arr.length];
       Stack<Integer> s1 = new Stack<>();
       
       
       for(int i = arr.length-1; i>=0; i--){
           
             // push index of element in stack rather than element itself
           
             while(!s1.isEmpty() && arr[s1.peek()]<=arr[i]){  
                s1.pop();
             }
           
           if(s1.isEmpty()){  // no greater element to right
               next_greater[i]= -1;
           }
               
           else{
                next_greater[i]=arr[s1.peek()];
               }
           
           s1.push(i); // push index of element in stack rather than element itself
       }
       
       for(int i=0; i<next_greater.length; i++){
           
           System.out.println(next_greater[i]+" ");
           
       }
    }
}

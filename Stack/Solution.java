/* Use two loops: The outer loop picks all the elements one by one. The inner loop looks
for the first greater element for the element picked by the outer loop. If a greater
element is found then that element is printed as next, otherwise, -1 is printed. */

class HelloWorld {
    
    public static void find_greater(int[] arr , int n){
        
           for(int i=0; i<n; i++){
            
            int next_greater=-1;
            
            for(int j=i+1; j<n; j++){
                
                if(arr[j]>=arr[i])
                {
                next_greater=arr[j];
                }
        }
      System.out.println(next_greater);
        
    }
    
    }
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        int arr[]= {11, 13, 21, 3};
        int n = arr.length;
       find_greater(arr, n);
    }
}


//Time Complexity: O(N2) 
//Auxiliary Space: O(1)



--------//--------//--------//--------//--------//--------//--------//--------//v--------//--------//--------//--------//--------//-

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
 // Time Complexity: O(N) && Auxiliary Space: O(N)
 // To find next greater element to left , just reverse the loop i.e  'for(int i = 0; i<arr.length; i++)'
    }
}

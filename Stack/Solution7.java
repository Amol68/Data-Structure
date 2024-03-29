import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       
       int arr[] = {6,4,9,12,11,55};
       int next_smaller[] = new int[arr.length];
       Stack<Integer> s1 = new Stack<>();
       

       for(int i = arr.length-1; i>=0; i--){
           
           // push index of element in stack rather than element itself
               while(!s1.isEmpty() && arr[s1.peek()]>=arr[i]){  
               s1.pop();
           }


           if(s1.isEmpty()){
               next_smaller[i]= -1;
           }


           else{
                next_smaller[i]=arr[s1.peek()];
           }

           
           s1.push(i); // push index of element in stack rather than element itself
       }

       
       for(int i=0; i<next_smaller.length; i++){
           
           System.out.println(next_smaller[i]+" ");
           
       }
    }
}


// for next smaller element to left , just reverse the for loop i.e ' for(int i =0; i<arr.length; i++)'

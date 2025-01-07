//Memoization Technique (Top down approach)

class Main {
    public static void main(String[] args) {
       
       int n = 5;
       int[] arr = new int[n+1];
       
       int result = fibonacci(n,arr);
       System.out.println(result);
    }
    
    public static int fibonacci(int n,int[] arr){
        
        if(n<2){
           return n;
        }
        
       return arr[n] = fibonacci(n-1,arr)+fibonacci(n-2,arr);
      
        
    }
}

// Time Complexity: O(n);
// Space Complexity: O(n);

----------->>----------->>----------->>----------->>----------->>----------->>----------->>----------->>----------->>----------->>----------->>----------->>----------->>----------->>


//Tabulation Technique (bottom up approach)
// Step1 -> Declare an array of size [n+1];
// Step2 -> Follow recurrance relation 



class Main {
    public static void main(String[] args) {
       
       int n = 5;
       
       int[] arr = new int[n+1];
       arr[0]=0;
       arr[1]=1;
       
       int result = fibonacci(n,arr);
       System.out.println(result);
    }
    
    public static int fibonacci(int n,int[] arr){
        
        if(n<2){
            return arr[n];
        }
        
         for(int i=2; i<=n; i++){
             arr[i]=arr[i-1]+arr[i-2];
         }
         
         return arr[n];
    }
}

// Time Complexity: O(n);
// Space Complexity: O(n);


----------->>----------->>----------->>----------->>----------->>----------->>----------->>----------->>----------->>----------->>----------->>----------->>----------->>----------->>


// Soace Optimization (Eliminate the array)


class Main {
    public static void main(String[] args) {
       
       int n = 5;
       int result = fibonacci(n);
       System.out.println(result);
    }
    
    public static int fibonacci(int n){
        
        if(n<2){
           return n;
        }
        
        int p2=0;
        int p1=1;
        int fib=0;
        
        for(int i=2; i<=n;i++){
         fib = p1+p2;
         p2=p1;
         p1=fib;
        }
         
         return fib;
    }
}

//Time Complexity: O(n);
//Space Complexity: O(1);

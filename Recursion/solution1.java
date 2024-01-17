// Traditional Approach using Iterations

public class fibo_iteration {

	
	public static void main(String[] args) {
	
		int a=0;
		int b=1;
		System.out.print(a+ " " +b);
		int c ;
		for(int i=1; i<=10; i++) {
			c= a+b;
			System.out.print(" " +c);
			a=b;
			b=c;
		}
	}

}



// Recursive Approach

public class fibo {

	public static void main(String[] args) {
	
		System.out.println(fibo(5));


	}
	
	static int fibo(int n) {
		
		if(n<2) {
			return n;
		}
		
		return fibo(n-1) + fibo(n-2);
		
	}
	
}

//Time complexity: O(n), 
//It is because, for printing n terms, the fib() function will call itself recursively for (n – 2) times and each time it will take constant time.


//Auxiliary Space: O(n), It is because, for each recursive call of the fib() function, a separate stack frame is created. For (n-2) calls,
//(n-2) stack frames are created with results in the O(n) space complexity.


public class no_reversal {

	 static int result;
	static void reverse(int num) {
		
		if(num==0) {
			return;
		}
		
		int rem = num%10;
		result = result * 10 + rem;
		reverse(num/10);
	}
	
	static boolean isPal(int n) {
		
		if(n==result) 
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
	 
		
	   int n = 66166;
       reverse(n);
       System.out.println("Original Value: " +n);
       System.out.println("Reversed Value: " +result);
       System.out.println("Palindrome: "+ isPal(n));
      
	}

}

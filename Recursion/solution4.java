
public class no_reversal {

	 static int result;
	static void reverse(int num) {
		
		if(num==0) {
			return;
		}
		
		int rem = num%10;
		result = result * 10 + rem;
		reverse(num/10);              // here we are not returning anything
	}
	
	public static void main(String[] args) {
	 
		
       reverse(6568);
       System.out.println(result);
	}

}

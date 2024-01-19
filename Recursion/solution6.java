
public class count_zeroes {
	
	 static int count_zero(int num, int count) {
		
		return helper(num,0);
	}
	 
	 static int helper(int n, int count) {
		 if(n==0) {
				return count;
			}
			
			if(n%10==0)
				return count_zero(n/10,count++);
			
			return count_zero(n/10,count);
	 }

	public static void main(String[] args) {
		
		
		int num = 206802;
		System.out.println(count_zero(num,0));

	}

}

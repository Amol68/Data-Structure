
public class factorial {
	
	int fact;
	static int fact(int num) {
		 
		if(num==1) {
			return num;
		}
		
		return num * fact(num-1);
		
	}

	public static void main(String[] args) {
		 System.out.println(fact(5));

	}

}

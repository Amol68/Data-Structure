
public class string_palindrome {
	
	public boolean check(String word)
	{
		
		char[] arr1 = word.toCharArray();
		int start = 0;
		int end = arr1.length-1;
		
		while(start<end)
		{
			if(arr1[start]!=arr1[end])
			{
				return false;
			}
			start++;
			end--;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		
		string_palindrome s1 = new string_palindrome();
		s1.check("madam");
		

		if(s1.check("that"))
		{
			System.out.println("String Is Palindrome");
			
		}
		else
		{
			System.out.println("String Is Not Palindrome");
		}
		
	}

}

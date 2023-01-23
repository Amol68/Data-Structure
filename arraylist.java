import java.util.*;

public class Main
{
	public static void main(String[] args) {
	
	    ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		System.out.println(l1);
	    
	    int val = l1.get(1);
	   	System.out.println(val);
	   	
	   	l1.add(1 , 05);
	    System.out.println(l1);
	    
	    l1.set(0,0);
	    l1.set(1,1);
	    System.out.println(l1);
	    
	    l1.remove(2);
	    System.out.println(l1);
	 
	 System.out.println(l1.size());
	 
	 Collections.sort(l1);
	  System.out.println(l1);
	    
	}
}

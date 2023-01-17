
public class Main
{
	public static void main(String[] args) {
	    
	    int[] marks = {9,3,4,5,7};
	    int[] markscopy = new int[marks.length];
	    
	    */
	    for(int counter = 0; counter<marks.length; counter++)
	    {                                                    // deep copy
	     markscopy[counter]=marks[counter]; 
	    }
	    */
	 
       // markscopy = marks; // shallow copy
       
        
        System.arraycopy(marks,2,markscopy,0,3);
	 
	    for(int counter = 0; counter<marks.length; counter++)
	    {
	     System.out.println(+marks[counter]);   
	    }
	    
	     System.out.println("--------------------------------");
	    
	    for(int counter = 0; counter<markscopy.length; counter++)
	    {
	     System.out.println(+markscopy[counter]);   
	    }
	}
}

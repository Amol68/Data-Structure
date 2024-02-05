
public class pattern {

	 static void print(int r, int c) {
		  
		 if(r==0) {
			 return;
		 }
		 
		 if(c<r) {
			
			 print(r,c+1);
			 System.out.print("*");
		 }
		 else {
			 
			 print(r-1,0);
			 System.out.println();
		 }
	 }
	
	public static void main(String[] args) {
		
       print(4,0);
	}

// Output
// *
// **
// ***
// ****

// --------->--------->--------->--------->--------->Inverse Triangle --------->--------->--------->--------->--------->--------->



	class HelloWorld {
    public static void main(String[] args) {
       int limit = 5;
       int arr
       print(limit,0);
       
    }
    
   public static void print(int row,int col){
       if(row==0) return;
       if(col<row){
           System.out.print("*");
           print(row,col+1);
       }
       else{
        System.out.println();
          print(row-1,0);
       }
       
   }

}

// Output
// *****
// ****
// ***
// **
// *


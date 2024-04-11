
// consider a 3*3 matrix  with rows and cols from 3,2,1;
// source:3,3 & destination:1,1;
// We can only move rightward / downwards
// When r==1 , we have reached last row , we cannot move downewards
// When c==1 , we have reached last row , we cannot move rightwards

class HelloWorld {
    public static void main(String[] args) {
       
      path("",3,3);
       
    }
    
    public static void path(String p,int r,int c){
        
       if(r==1 && c==1){     // we have reached destination
           System.out.println(p);
           return;
       }
       
        
        if(r>1){
              path(p+'D',r-1,c);
        }
        
         if(c>1){
              path(p+'R',r,c-1);
        }
        
    }
}


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


// -------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>


import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       
     System.out.println(path("",3,3)) ;
       
    }
    
    public static ArrayList<String> path(String p,int r,int c){
          
       if(r==1 && c==1){
           
          ArrayList<String> list = new ArrayList<>();
          list.add(p);
          return list;
       }
       
        ArrayList<String> list = new ArrayList<>();
        
        if(r>1){
            list.addAll(path(p+'D',r-1,c));
        }
        
         if(c>1){
           list.addAll(path(p+'R',r,c-1));
        }
        
        return list;
        
    }
}


// -------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>
// here we are also considering diagonal


import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       
     System.out.println(path("",3,3)) ;
       
    }
    
    public static ArrayList<String> path(String p,int r,int c){
        
        
        
       if(r==1 && c==1){
           
          ArrayList<String> list = new ArrayList<>();
          list.add(p);
          return list;
       }
       
        ArrayList<String> list = new ArrayList<>();
        
        if(r>1 && c>1){
            list.addAll(path(p+'C',r-1,c-1));
        }
        
        if(r>1){
            list.addAll(path(p+'D',r-1,c));
        }
        
         if(c>1){
           list.addAll(path(p+'R',r,c-1));
        }
        
        return list;
        
    }
}



// -------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>-------->>
// here we have a river in a cell



import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       
       boolean[][] board ={
           {true,true,true},
           {true,false,true},
           {true,true,true}
       } ;
       
      path("",board,0,0);
       
    }
    
    public static void path(String p,boolean[][] maze,int r,int c){
        
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        
        if(!maze[r][c]){
            return;
        }
        
       
        
        if(r<maze.length-1){
           path(p+"D",maze,r+1,c);
        }
        
         if(c<maze[0].length-1){
            path(p+"R",maze,r,c+1);
        }
        
       
    }
}

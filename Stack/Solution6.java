import java.util.*;
class HelloWorld {
    
    
    public static boolean is_Duplicate(String str)
    {
         Stack<Character> s1 = new Stack<>();
         
         for(int i=0; i<str.length(); i++) {
         
              char ch = str.charAt(i);
            
              if(ch ==')')  // condition for closing
              { 
                  
                  int count = 0;
                  
                  while(s1.peek()!='('){
                      s1.pop();
                      count++;
                  }
                  
                  if(count<1){
                      return true; // duplicate parenthesis found
                  }
                  
                  else{
                      s1.pop();
                  }
              }
              
              else {// if '(' , operand , operator is found ,push into stack
                 
                  s1.push(ch);
              }
         }
        
        return false;   // if duplicate not found
    }
    
       public static void main(String[] args) {

       String str1 = "((a+b))";
       String str2 = "(a+b)";
        
        System.out.println(is_Duplicate(str2));
       
    }
}

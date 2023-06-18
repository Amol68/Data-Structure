
import java.util.Stack;
class solution2{
    
    static void insert_at_bottom(Stack<Integer> S , int n){
        
        Stack<Integer> temp = new Stack<>();
        
        while(!S.empty()){
            
            temp.push(S.peek());
            S.pop();
        }
        S.push(n);
        
        while(!temp.empty()){
            S.push(temp.peek());
            temp.pop();
        }
        
        while(!S.empty()){
            System.out.println(S.peek());
            S.pop();
        }
        
    }
    
    public static void main(String[] args){
        
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        
        System.out.println("Original Stack:");
        insert_at_bottom(s1 , 50);
        
    }
    
}

_ _ _ _ _ _ _ _ \\ _ _ _ _ _ _ _ _ \\ _ _ _ _ _ _ _ _ \\ _ _ _ _ _ _ _ _ \\ _ _ _ _ _ _ _ _ \\ _ _ _ _ _ _ _ _ \\ _ _ _ _ _ _ _ _ \\
    USING RECUSRSION

import java.util.Stack;
class Solution2 {
    
    static void push_at_bottom(Stack<Integer> S , int n){
        
        if(S.isEmpty()){
            S.push(n);
            return;
        }
        
        int top = S.pop();
        push_at_bottom(S , n);
        S.push(top);
    }
    
    public static void main(String[] args) 
    {
        Stack<Integer> s1 = new Stack<>();
        s1.push(20);
        s1.push(30);
        s1.push(40);
        
        push_at_bottom(s1 , 10);
        while(!s1.isEmpty()){
           System.out.println(s1.peek());   
        }
        
    }
}

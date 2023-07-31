import java.util.*;
class HelloWorld {
    
    public static Queue<Integer> reverse(Queue<Integer> q){
		
		Stack<Integer> st = new Stack<>();
		
		while(!q.isEmpty()) {
			st.push(q.remove());
		}
		while(!st.isEmpty()) {
			q.add(st.pop());
		}
		return q;
	}
    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>();
		
		for(int i=0; i<10; i++) {
			q.add(i);
		}
		
		System.out.println("Original:" +q);
		Queue q2=reverse(q);
		System.out.println("Reversed:" +q2);
		
	}
    }

/* Complexity anaylysis :-
Space Complexity :- O(N)
Time Complexity :- O(N) */ 

------>------>------>------>------>------>v------>------>------>------>------>------>------>------>------>------>------>------>------>

//USING RECURSION

void reverse(Queue q){
   if(q.isEmpty()){
   return;
}
   int value = q.front();
   q.pop();
   reverse();
   q.push(value);
}




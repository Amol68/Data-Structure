class MyQueue {


    Stack<Integer> input , output;

    public MyQueue() {
        input=new Stack();
        output=new Stack();
    }
    
     void push(int x) {
          input.push(x);
        }
    
    public int pop() {
        int val = peek();
        output.pop();
        return val;
    }
    
    public int peek() {
        
    if(output.empty()){
        while(input.isEmpty()==false){
            output.push(input.peek());
            input.pop();
        }
    } 
     return output.peek();
    }
    
    public boolean empty() {
        return input.empty() && output.empty();
    }
}

/* Time Complexity: 
Push operation: O(N). 
In the worst case we have empty whole of stack 1 into stack 2.
Pop operation: O(1). 
Same as pop operation in stack.
Auxiliary Space: O(N). 
Use of stack for storing values. */

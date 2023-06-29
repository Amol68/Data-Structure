import java.util.*;

class Queue{
    
    private list_node front;
    private list_node rear;
    private int length;
    
    public Queue(){
        front = null;
        rear = null;
        length = 0;
    }
    
    private class list_node{
        
        private int data;
        private list_node next;
        
        public list_node(int data){
        this.data=data;
        this.next=null;
        }
    }
    
    public int length(){
        return length;
    }
    
    public boolean isEmpty(){
      return length==0; //if length==0 it will return true otherwise false
    }
    
    public void enqueue(int data){
        
        list_node temp = new list_node(data);
        
        if(isEmpty()){
            front=temp;
        }
       else{
          rear.next=temp;
        }
       rear = temp;
       length++;   
    }
    
    public int dequeue(){
        
        if(isEmpty()){
            throw new NoSuchElementException("Empty Queue"); 
           // Thrown by various accessor methods to indicate that the element being requested does not exist.
        }

            int result = front.data;
            front = front.next;
            if(front==null){
            rear = null;
            length--;
           }
         return result;
    }
    
    public void print(){

        if(isEmpty()){
            return;
        }
        
        list_node current = front;

        while(current!=null){
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
       Queue q1 = new Queue();
       q1.enqueue(10);
       q1.enqueue(20);
       q1.enqueue(30);
       q1.print();
       q1.dequeue();
       q1.print();
    }
}

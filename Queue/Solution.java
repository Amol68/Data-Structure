/* The queue is a type of data structure that can be implemented using an array or a linked list. 
A queue is data structure that is based on first-in first-out (FIFO) in which the first item 
input is also the first item removed. Items are added to the end of the line and removed from the beginning.
When utilising an array to construct a queue, the fact that an array has a fixed size once declared poses an
issue in the queue implementation. When elements are added to a queue and then deleted, a gap is created. To
fill the gap, we can rearrange the remaining components to fill the space, but it is a time-consuming procedure. 
Another alternative is to use a circular queue, with the front and back pointing to the beginning of the array after 
the maximum size has been achieved. */

class Solution{
    
    static class Queue{
        
        static int arr[];
        static int size;
        static int rear;
        // no need to declare front as it is always 0
          
        Queue(int size){
            this.size = size;
            arr = new int[size];
            rear=-1;
        }
        
        public static boolean isEmpty(){
            return rear == -1; // if stack is empty(rear=-1) , return true;
        }
        
        public static boolean isFull(){
             return rear==size-1;
        }
        
        public static void enqueue(int data){
            
            if(isFull()){
                System.out.println("Full Queue");
                return;
            }
            
            rear++;
            arr[rear]=data;
            
            
        }
        
        
       public static int dequeue(){
           if(isEmpty()){
               System.out.println("Empty Queue");
               return -1;
           }
           
           int front = arr[0];
           
           for(int i=0; i<rear; i++){
               arr[i] = arr[i+1];
           }
           rear--; // rear shifted to previous place
           return front;
       }
        
        
        public static int peek(){
        
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        
        return arr[0];
    }
    
    }
    public static void main(String[] args) {
        
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        
        while(!q.isEmpty()){
            
              System.out.println(q.peek());
               q.dequeue();
        }
    
    }

}

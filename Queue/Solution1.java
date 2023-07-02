//  https://www.geeksforgeeks.org/introduction-to-circular-queue/


class Solution1{
    
    static class Queue{
        
        static int arr[];
        static int size;
        static int front=-1;
        static int rear=-1;
          
        Queue(int size){
            this.size = size;
            arr = new int[size];
            rear=-1;
        }
        
        public static boolean isEmpty(){
            return rear == -1 && front==-1;
        }
        
        public static boolean isFull(){
             return (rear+1) % size == front;
        }
        
        public static void enqueue(int data){
            
            if(isFull()){
                System.out.println("Full Queue");
                return;
            }
            
            if(front==-1){  // adding first element
                front=0;
            }
            
            rear = (rear+1)%size;
            arr[rear]=data;
            
            
        }
        
        
       public static int dequeue(){
           if(isEmpty()){
               System.out.println("Empty Queue");
               return -1;
           }
           
           int result = arr[front];
           
           if(rear==front){ // if only one element is in queue, queue  becomes empty 
                 rear = front= -1;  
               }else{
                   front = (front+1) % size;
               }
    
           return result;
       }
        
        
        public static int peek(){
        
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        
        return arr[front];
    }
    
    }
    public static void main(String[] args) {
        
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        
        System.out.println("Discarded:"+q.dequeue());
        q.enqueue(6);
        
        System.out.println(q.dequeue());
        q.enqueue(7);
        
        while(!q.isEmpty()){
            
              System.out.println(q.peek());
               q.dequeue();
        }
        
        
    
    }

}

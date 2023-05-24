
public class Main
{
    
    private static list_node head;
    
    static class list_node{
        
        private int data;
        private list_node next;
        
        list_node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    
    
    public static void display()
    {
        
        list_node current = head;
        while(current!=null)
        {
            System.out.print(current.data +"--->");
            current = current.next;
        }
        System.out.println();
    }
    
     public static void find_length()
    {
        int count = 0;
        list_node current = head;
        while(current!=null)
        {
            current = current.next;
            count++;
        }
         
        System.out.println("Length:" +count);
    }
    
    public void insert_at_start(int data) //function to insert element at first position
    {
        list_node l1 = new list_node(data);
        l1.next = head;
        head = l1;
    }
    
    public void insert(int data , int position) //function to insert element at given position
    {
        list_node l1 = new list_node(data);
        
        if(position==1)
        {
         l1.next=head;
         head = l1;
       }
       else{
           
            list_node previous = head;
            int count = 1;
            while(count < position-1)
            {
                previous = previous.next;
                count++;
            }
            
            list_node current = previous.next;
           previous.next = l1;
           l1.next = current;
       }
      
    }
    public void insert_at_end(int data)  //function to insert element at end
    {
        list_node l1 = new list_node(data);
        
        if(head==null)
        {
            head = l1;
            return;
        }
        
        list_node current = head;
        while(current.next!=null)
        {
            current = current.next;
        }
        
        current.next = l1;
        
    }
    
    
    
    
	public static void main(String[] args) {
	    
	    Main m1 = new Main();
	    
	    m1.head = new list_node(1);
	    list_node second = new list_node(2);
	    list_node third = new list_node(3);
	    list_node fourth = new list_node(4);
	    
	    m1.head.next = second;
		second.next = third;
		third.next = fourth;
	    
	    m1.display();
	    //m1.find_length();
	    m1.insert_at_start(0);
	    m1.insert_at_end(99);
	    m1.display();
	    m1.insert(3,3);
	      m1.display();
	}
}

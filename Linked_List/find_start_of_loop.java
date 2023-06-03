package linked_list;

public class LinkedList {

    private static list_node head;
	
	private static class list_node
	{
	  private int data;
	  private list_node next;
	  
	  public list_node(int data)
	  {
		  this.data = data;
		  this.next=null;
	  }
	}
	
	
	// function to display nodes
	public void display()
	{
		list_node current = head;
		while(current != null)
		{
			System.out.print(current.data + "--->");
			current = current.next;
		}
		System.out.println(" null");
	}
	
	// Functtion to detect loop
	public boolean detect_loop() {
		
		list_node fast_ptr = head;
		list_node slow_ptr = head;
		
		while(fast_ptr != null && fast_ptr.next!= null) {
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
			
			if(slow_ptr == fast_ptr) {
				return true;
			}
		}
		return false;
		
	}
	
  // Functtion to detect starting point of loop
public list_node find_start_of_loop() {
		
		list_node fast_ptr = head;
		list_node slow_ptr = head;
		
		while(fast_ptr != null && fast_ptr.next!= null) {
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
			
			if(slow_ptr == fast_ptr) {
				return get_start_node(slow_ptr);
			}
		}
		return null;
		
	}
	
  // function that returns starting node of loop
	private list_node get_start_node(list_node slowptr) {
	
		list_node temp = head;
		
		while(temp!=slowptr) {
			temp = temp.next;
			slowptr = slowptr.next;
		}
		return temp;
	
}


	
	
	

	public static void main(String[] args)
	{
		LinkedList l1 = new LinkedList();
		l1.head = new list_node(10);
		list_node second = new list_node(13);
		list_node third = new list_node(15);
	    list_node fourth = new list_node(17);
	    list_node fifth = new list_node(19);
		
		l1.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = third;
		
		
		

System.out.println(l1.detect_loop());
System.out.println(l1.find_start_of_loop().data);


    
  
    }
			
}

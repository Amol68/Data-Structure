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
	
	// Function to delete a node with given key
	public void delete_key(int key) {
		
		list_node current = head;
		list_node temp = null;
		
		if(current!=null && current.data==key) {
			head = current.next;
			return;
		}
		
		while(current!=null && current.data!=key) {
			temp = current;
			current = current.next;
		}
		
		if(current==null) {
			return;
		}
		
		temp.next = current.next;
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
		
l1.display();
l1.delete_key(15);
l1.display();
    
  
    }
			
}

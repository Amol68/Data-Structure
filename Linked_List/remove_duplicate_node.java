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
	public void display(list_node reverse_head)
	{
		list_node current = head;
		while(current != null)
		{
			System.out.print(current.data + "--->");
			current = current.next;
		}
		System.out.println(" null");
	}
	
	
	
	
	
	
	
	
	public void remove_duplicate() // Function to remove duplicate nodes
	{
		if(head==null) {
			return;
		}
		
		list_node current = head;
		
		while(current!=null && current.next!=null) {
			if(current.data==current.next.data) {
				current.next = current.next.next;
			}
			else {
				current = current.next;
			}
			
		}
	}
	
	public static void main(String[] args)
	{
		LinkedList l1 = new LinkedList();
		l1.head = new list_node(10);
		list_node second = new list_node(4);
		list_node third = new list_node(11);
	    list_node fourth = new list_node(11);
	    list_node fifth = new list_node(88);
		
		l1.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
	l1.display(head);
	
    
    l1.remove_duplicate();
	l1.display(head);
    }
			
}

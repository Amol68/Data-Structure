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
	
	


	
	
	// Function to display node at sorted list
	public list_node insert_at_sorted_list(int value) {
		
	 list_node newNode = new list_node(value);
	 
	 if(head==null) {
		 return head;
	 }
	 
	 list_node current = head;
	 list_node temp = null;
	 
	 while(current!=null && current.data<newNode.data) {
		 
		 temp = current;
		 current = current.next;
		 
	 }
	 
	 newNode.next = current;
	 temp.next=newNode;
	return head;
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
		
	l1.display(head);
	l1.insert_at_sorted_list(14);
	l1.display(head);
	
    
  
    }
			
}

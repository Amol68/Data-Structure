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
	
	
	
	
	public void insert_at_first(int value)
	{
		list_node l1 = new list_node(value);
		l1.next=head;
		head = l1;
	}
	

	
	public list_node find_node_from_last(int n) // Function to find nth node from last
	{
		if(head==null) {
			return null;
		}
		
		if(n<=0) {
			throw new IllegalArgumentException("Invaild Value:" +n);
		}
		
		list_node main_ptr = head;
		list_node ref_ptr = head;
		
		int count = 0;
		while(count<n) {
			ref_ptr = ref_ptr.next;
			count++;
		}
		
		while(ref_ptr!=null) {
			ref_ptr = ref_ptr.next;
			main_ptr = main_ptr.next;
		}
		
		return main_ptr;
	}
	
	public static void main(String[] args)
	{
		LinkedList l1 = new LinkedList();
		l1.head = new list_node(10);
		list_node second = new list_node(1);
		list_node third = new list_node(8);
	    list_node fourth = new list_node(11);
	    list_node fifth = new list_node(88);
		
		l1.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
	l1.display(head);
	
    list_node node = l1.find_node_from_last(3);
    System.out.println("Resultant Node:" +node.data);
	
    }
			
}

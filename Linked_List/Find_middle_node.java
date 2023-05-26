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
	
	
	// function to count length of linked-list
	public int length()
	{
		if(head==null)
		{
			return 0;
		}
		
		int count = 0;
		
		list_node current = head;
		
		while(current!=null)
		{
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void insert_at_first(int value)
	{
		list_node l1 = new list_node(value);
		l1.next=head;
		head = l1;
	}
	
	public void insert_at_last(int value)
	{
		list_node l1 = new list_node(value);
	    
		if(head==null)
		{
			head=l1;
		}
		
		list_node current = head;
		while(current.next!=null)
		{
		current = current.next;	
		}
		current.next = l1;
	}
	
	public list_node get_middle_node()
	{
		if(head==null)
		{
			return null;
		}
		list_node slw_ptr = head;
		list_node fast_ptr = head;
		
		while(fast_ptr!=null && fast_ptr.next!=null) {
			slw_ptr = slw_ptr.next;
			fast_ptr = fast_ptr.next.next;
		}
		
		return slw_ptr;
	}
	
	public static void main(String[] args)
	{
		LinkedList l1 = new LinkedList();
		l1.head = new list_node(10);
		list_node second = new list_node(1);
		list_node third = new list_node(8);
	    list_node fourth = new list_node(11);
		
		l1.head.next = second;
		second.next = third;
		third.next = fourth;
		
	l1.display(head);
	
	
	list_node middle = l1.get_middle_node();
	System.out.println(middle.data);
	
    }
			
}

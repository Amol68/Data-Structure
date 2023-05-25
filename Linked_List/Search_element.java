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
	
  // function to search an element 
	public static boolean search_element(list_node head , int searchkey) {
		
		list_node current = head;
		
		while(current!=null)
		{
			if(current.data==searchkey) {
				return true;
			}
			current = current.next;
		}
		return false;
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
		
	l1.display();
  //l1.insert_at_first(6);
	//l1.insert_at_first(999);
     // l1.insert_at_last(888);
	//l1.display();
	//System.out.println(l1.length());
	
	if(l1.search_element(head ,199))
{
	System.out.println("Found");
	}
	else {
		System.out.println("Not Found");
	}
	}
			
}

package linked_list;

public class LinkedList {

    private static list_node head;
	
	private  static class list_node
	{
	  private int data;
	  private list_node next;
	  
	  public list_node(int data)
	  {
		  this.data = data;
		  this.next=null;
	  }
	}
	
	public void insertLast(int value) {
	      list_node newNode= new list_node(value);
	      if (head == null) {
	         head = newNode;
	         return;
	      }
	       list_node  current = head;
	      while (null != current.next) {
	         current = current.next;
	      }
	      current.next = newNode;
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
	
	
public static list_node merge_sorted_list(list_node a , list_node b) {
	
	list_node dummy = new list_node(0);
	list_node tail = dummy;
	
	while(a!=null && b!=null) {
		
		if(a.data<b.data) {
			tail.next = a;
			a = a.next;
		}
		else {
			tail.next = b;
			b = b.next;
		}
		
		tail = tail.next;
	}
	
	if(a==null) {
		tail.next = b;
	}
	else {
		tail.next = a;
	}
		
	return dummy.next;
}



	
	

	public static void main(String[] args)
	{
		LinkedList l1 = new LinkedList();
		l1.insertLast(1);
		l1.insertLast(3);
		l1.insertLast(5);
		l1.display();
		
		LinkedList l2 = new LinkedList();
		l2.insertLast(2);
		l2.insertLast(4);
		l2.insertLast(6);
		l2.display();
		
		LinkedList result = new LinkedList();
		result.head= merge_sorted_list(l1.head , l2.head);
        result.display();
    }
			
}

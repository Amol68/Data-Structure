
public class Main
{
    
   private static list_node head;
   
    public static class list_node{
       
     private int data;
     private list_node next;
     
     list_node(int data)
     {
         this.data = data;
         this.next= null;
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
    }
    
    public static list_node delete_first_node()
    {
        list_node temp = head;
        head = head.next;
        temp.next=null;
        return temp;
    }
	public static void main(String[] args) {
	
	    Main m1 = new Main();
	    m1.head = new list_node(0);
	   list_node second = new list_node(1);
	   list_node third = new list_node(2);
	   list_node fourth = new list_node(3);
	   list_node fifth = new list_node(4);
	   
	   m1.head.next=second;
	   second.next=third;
	   third.next=fourth;
	   fourth.next=fifth;
	   
	   m1.display();
	   System.out.println();
	   System.out.println(m1.delete_first_node().data);
	   m1.display();
	}
}

package stack;

import java.util.EmptyStackException;

public class stack {
	
	private list_node top;
	private int length;
	
	class list_node{
		
		private list_node next;
		private int data;
		
		public list_node(int data) {
			
			this.data = data;
			this.next = null;
			
		}
		
	}

	public stack() {
		
		top = null;
		length = 0;
	}
	
	public int get_length() {
		
		return length;
	}
	
	public boolean is_empty() {
		
		return length == 0;
	}
	
	public void push(int data) {
		
		list_node temp = new list_node(data);
		temp.next = top;
		top = temp;
		length++;
	}
	
	public int pop(){
		if(is_empty()) {
			throw new EmptyStackException();
		}
		
		int result = top.data;
		top = top.next;
		length --;
		
		return result;
	}
	
	public int peek() {
		
		if(is_empty()) {
			throw new EmptyStackException();
		}
		
		return top.data;
	}
	public static void main(String[] args) {
		
		stack s1 = new stack();
		s1.push(2);
		s1.push(2);
		s1.push(3);
		s1.pop();
		System.out.println(s1.peek());
	}
	
}

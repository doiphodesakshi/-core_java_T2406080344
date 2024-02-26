package session_09;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		// by using this method we can create array
		LinkedList l= new LinkedList();
		//0 index
		l.add("mayuri");
		//1 index
		l.add(30);
		//2 index
		l.add(null);
		// 3 index
		l.add("mayuri");
		
		System.out.println(l);
		//set method
		l.set(0,"rahul");
		System.out.println(l);
		//remove method
		l.removeLast();
		System.out.println(l);
		//insertion at first position
		l.addFirst("Sakshi");
		System.out.println(l);
		
				
		
	}

}

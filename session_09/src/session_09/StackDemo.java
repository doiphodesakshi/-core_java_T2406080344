package session_09;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		s.add("F");
		System.out.println(s);
		s.pop();// LIFO 
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search("A"));
		System.out.println(s.search("B"));
		System.out.println(s.search("E"));
		System.out.println(s.search("d"));
		System.out.println(s.empty());
	}
	

}

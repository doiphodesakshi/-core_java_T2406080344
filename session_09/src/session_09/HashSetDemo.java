package session_09;

import java.util.LinkedHashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		/*HashSet h= new HashSet();*/
		LinkedHashSet h= new LinkedHashSet();
		h.add("a");
		h.add(" b");
		h.add(null);
		System.out.println(h.add(10));
		System.out.println(h);
	}
}












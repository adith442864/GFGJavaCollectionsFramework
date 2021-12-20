package Set;

import java.util.LinkedHashSet;

public class LinkedHashSetConcept {

	public static void main(String[] args) {
		
		//pre-defined for traversal of item
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.remove(10);
		lhs.add(10);
		
		for(Integer x : lhs) {
			System.out.println(x);
		}
		

	}

}

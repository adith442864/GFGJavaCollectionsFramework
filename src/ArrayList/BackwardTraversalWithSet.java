package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class BackwardTraversalWithSet {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		ListIterator<Integer> it = al.listIterator(al.size());
		while(it.hasPrevious()) {
			int x=it.previous();
			it.set(x*2);
			
		}
		
		System.out.println(al);

	}

}

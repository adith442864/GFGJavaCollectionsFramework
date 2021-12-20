package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ForwardTraversal {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		
		ListIterator<Integer> it = al.listIterator();
		while(it.hasNext()) {
			it.next();
		}
			
		System.out.println(al);
	}

}

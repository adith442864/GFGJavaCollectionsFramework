package DeQueue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeTraversal {
	
	public static void main(String args[]) {
		
		Deque d = new LinkedList();
		
		d.addFirst(5);
		d.addLast(20);
		d.addFirst(5);
		d.addLast(15);
		
		Iterator it  = d.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		for(Object s:d) {
			System.out.print(s+" ");
		}
		
		
		
		
	}

}

package DeQueue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeTraversalLastToFirst {

	public static void main(String[] args) {
		Deque d = new LinkedList();
		

		d.addFirst(5);
		d.addLast(20);
		d.addFirst(10);
		d.addLast(15);
		
		Iterator it = d.descendingIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

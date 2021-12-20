package DeQueue;

import java.util.ArrayDeque;

public class ArrayDequeasDeque {
	
public static void main(String args[]) {
		
		ArrayDeque ad = new ArrayDeque();
		
		ad.offerFirst(10);
		ad.offerLast(20);
		ad.offerFirst(30);
		ad.offerLast(40);
		
		// [30,10,20,40]
		System.out.println(ad.peekFirst()); //30
		System.out.println(ad.peekLast()); //40
		
		System.out.println(ad.pollFirst()); //30
		System.out.println(ad.peekFirst()); // 10
		
		System.out.println(ad);
		
		System.out.println(ad.pollLast()); //40
		System.out.println(ad.peekLast()); //20
		
		//corresponding equivalent functions:
		
		/* Throw Excep --> do not throw excep / return boolean value
		 * addFirst() --> offerFirst()
		 * addLast()  --> offerLast()
		 * removeFirst() --> pollFirst()
		 * removeLast()  --> pollLast()
		 * getFirst() --> peekFirst()
		 * getLast() --> peekLast()
		 * 
		 * Redundant functions:
		 * add()  -- addLast()
		 * remove() --removeFirst()
		 * poll() -- pollFirst()
		 * offer() -- offerLast()
		 * element() -- getFirst()
		 * peek() -- peekFirst()
		 * push -- addFirst()
		 * pop() -- removeFirst()
		 * 
		 * 
		 */
		
	}

}

package DeQueue;

import java.util.ArrayDeque;

public class ArrayDequeasQueue {
	
	public static void main(String args[]) {
		
		ArrayDeque ad = new ArrayDeque();
		
		ad.offer(10);
		ad.offer(20);
		
		System.out.println(ad.peek()); //return the top element
		System.out.println(ad.poll()); // remove
		
		System.out.println(ad.peek());
		
		ad.offer(40);
		System.out.println(ad.peek());
		
		//functions:
			//add 	---- offer
			//remove--- poll
			//element --- peek
	}

}

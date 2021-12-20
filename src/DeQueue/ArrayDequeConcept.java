package DeQueue;

import java.util.ArrayDeque;

public class ArrayDequeConcept {

	public static void main(String[] args) {
		
		// collection -> queue --> deque --> ArrayDeque
		// doesn't have Linklist functionalities
		// can be used stack, queue and dequeue
		// faster than list,cache friendly..
		
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		
		System.out.println(ad);
		

	}

}

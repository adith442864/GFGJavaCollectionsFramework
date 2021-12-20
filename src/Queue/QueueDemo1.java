package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo1 {

	public static void main(String[] args) {
		
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.offer(10); // add function
		q.offer(20);
		q.offer(30);
		
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		System.out.println(q);
		
		System.out.println(q.peek()); //gives you the first item to be removed/return null if empty
		System.out.println(q.poll()); //removes the first item and returns the removed item
		System.out.println(q.peek());// 20
		
		//more functions:
		System.out.println(q.element());
		q.add(40);
		System.out.println(q);
		q.remove(40);
		System.out.println(q);

	}

}

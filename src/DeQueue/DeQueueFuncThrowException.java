package DeQueue;

import java.util.Deque;
import java.util.LinkedList;

public class DeQueueFuncThrowException {
	
	 public static void main(String[] args) 
	    {
	        Deque<Integer> d = new LinkedList<Integer>();
	        
	        // Adds element to front of queue
	        d.addFirst(10);
	        d.addLast(20);
	        d.addFirst(5);
	        d.addLast(15);
	       
	        // [5,10,20,15]
	        
	        // Retrieve the head element
	        System.out.println(d.getFirst()); //5
	        
	        // Retrieve the tail element
	        System.out.println(d.getLast()); //15
	        
	        // Retrieve and remove the head element
	        d.removeFirst(); //5
	        
	        // Retrieve and remove the tail element
	        d.removeLast(); //15
	        
	        System.out.println(d.getFirst());
	        System.out.println(d.getLast());
	    }
	 
	 //dequeue is empty, getfirst and getlast fun throw exception...

}

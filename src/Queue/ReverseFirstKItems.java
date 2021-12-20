package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ReverseFirstKItems {
	
	 static void reverseK(Queue<Integer> q, int k)
     {
         if(q.size()<0 || k <=0 )
             return;
         
         Deque<Integer> stack = new ArrayDeque<Integer>();
         
         for(int i=0; i<k; i++)
         {
             stack.push(q.poll());
         }
         
         while(stack.isEmpty()==false)
             q.offer(stack.pop());
             
         for(int i=0; i<q.size()-k; i++)
             q.offer(q.poll());
     }

	 public static void main (String[] args) {
	     // Queue<Integer> q = new LinkedList<Integer>(); 
	     Queue<Integer> q = new ArrayDeque<Integer>(); 
	     
	     q.offer(10); 
	     q.offer(20); 
	     q.offer(30); 
	     q.offer(40);
	     q.offer(50);
	    
	    int k=3;
	    
	    reverseK(q,k);
	    
	    System.out.println(q);
	 } 

}

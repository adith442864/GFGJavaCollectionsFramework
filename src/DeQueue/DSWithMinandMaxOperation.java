package DeQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DSWithMinandMaxOperation {

Deque<Integer> dq;
    
    DSWithMinandMaxOperation()
    {
        dq = new ArrayDeque<Integer>();
    }
    
    void insertMin(int x)
    {
        // offerFirst() inserts an element
        // at front of Deque
        dq.offerFirst(x);
    }
    
    void insertMax(int x)
    {
        // offerLast() inserts an element 
        // at end of Deque
        dq.offerLast(x);
    }
    
    int getMin()
    {
        // peekFirst() returns element at front 
        // of Deque
        return dq.peekFirst();
    }
    
    int getMax()
    {
        // peekLast() returns an element from the
        // end of Deque
        return dq.peekLast();
    }
    
    int extractMin()
    {
        // pollFirst() returns and remove the element
        // present at front of Deque
        return dq.pollFirst();
    }
    
    int extractMax()
    {
        // pollLast() returns and remove the element
        // present at end of Deque
       return dq.pollLast();
    }

	public static void main (String[] args) {
		DSWithMinandMaxOperation ds = new DSWithMinandMaxOperation();
		
		ds.insertMin(10);
		ds.insertMax(15);
		ds.insertMin(5);
		
		int x= ds.extractMin();
		System.out.println(x);
		
		x= ds.extractMax();
		System.out.println(x);
		
		ds.insertMin(8);
		
		
		
	}

}

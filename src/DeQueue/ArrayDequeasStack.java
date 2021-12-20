package DeQueue;

import java.util.ArrayDeque;

public class ArrayDequeasStack {
	
public static void main(String args[]) {
		
		ArrayDeque ad = new ArrayDeque();
		ad.push(10);
		ad.push(20);
		
		System.out.println(ad.peek()); //top of the stack
		ad.push(30);
		System.out.println(ad.pop()); //return the removed item
		
		System.out.println(ad.peek());
		ad.push(40);
		System.out.println(ad.peek());
	}

}

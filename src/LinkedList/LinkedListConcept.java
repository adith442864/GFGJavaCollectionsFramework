package LinkedList;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		
		// it does not waste space
		// insert at end is costly in ArrayList, insertion not to take time in any case, preferred LinkedLit
		// insert at the beginning..
		
		System.out.println(list);
		System.out.println(list.size());
		
	//common functions:
		
		//add(x)
		//add(index, x)
		//contains()x
		//remove(index)
		//remove(x)
		//get(index)
		//set(index, x)
		//indexOf(x)
		//lastIndexOf(x),
		//isEmpty()
		
		//Functions in LinkedList:
		//Queue:
			//add()
			//remove
			//element()
			//offer()
			//poll()
			//peek() ->returns null, if queue is empty:
		
		//Dequeue:-> insert/delete at both ends
			//addFirst(x)
			//removeFirst
			//getFirst()
			//addLast(x)
			//removeLast() -->remove item from the first of queue
			//getLast()
			//offerFirst(x)
			//pollFirst()
			//peekFirst()
			//offerLast(x)
			//pollLast()
			//peekLast()
		
		
		
		
		
		

	}

}

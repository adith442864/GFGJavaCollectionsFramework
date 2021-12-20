package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorAdd {

	public static void main(String[] args) {
	
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		ListIterator<Integer> it = al.listIterator();
		while(it.hasNext()) {
			it.add(5); //5 10 5 20 5 30 5
			it.next();
		}
		
		System.out.println(al);

	}

}

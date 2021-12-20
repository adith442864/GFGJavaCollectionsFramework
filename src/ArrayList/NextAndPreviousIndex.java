package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class NextAndPreviousIndex {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		ListIterator<Integer> it = al.listIterator(2);
		System.out.println(it.previousIndex()); //1
		System.out.println(it.nextIndex()); //2

	}

}

package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraversal {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(30);
		
		System.out.println(al.size());
		
		//1. simple for loop with get method:
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		//2. for each loop:
		for(int e:al) {
			System.out.println(e);
		}
		
		//for each loop using string:
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("geeks");
		al1.add("ide");
		al1.add("courses");
		
		System.out.println(al1.size());
		for(String s:al1) {
			System.out.print(s+" ");
		}
		
		System.out.println("");
		
		//3. Iterator:
		Iterator it = al1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
		
		System.out.println(" ");
		
		// Iterator-> removing an item while traversal:
		Iterator it1 = al.iterator();
		while(it1.hasNext()) {
			int x = (Integer) it1.next();
			if(x<10)
				it1.remove();
			else
				System.out.println(x);
		}
		
		
		//4. forEach Method:
		al.forEach(x->System.out.println(x));
		
		

	}

}

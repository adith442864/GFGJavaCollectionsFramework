package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetConcept {

	public static void main(String[] args) {
		
		TreeSet<String> s = new TreeSet<String>();
		s.add("gfg");
		s.add("courses");
		s.add("ide");
		
		System.out.println(s);
		
		System.out.println(s.contains("ide"));
		
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(5);
		ts.add(2);
		ts.add(15);
		
		System.out.println(ts);
		ts.remove(30);
		System.out.println(ts);
		
		//traversal
		for(Integer x : ts) {
			System.out.println(x);
		}
		
		System.out.println(ts.lower(5));
		System.out.println(ts.higher(5));
		
		System.out.println(ts.floor(5));
		System.out.println(ts.ceiling(5));
		

	}

}

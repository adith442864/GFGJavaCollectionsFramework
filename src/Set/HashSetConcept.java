package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("gfg");
		hs.add("courses");
		hs.add("ide");
		
		
		System.out.println(hs);
		System.out.println(hs.contains("courses"));
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		System.out.println("------------");
		System.out.println(hs.size());
		
		hs.remove("ide");
		System.out.println(hs);
		System.out.println(hs.size());
		
		for(String s: hs) {
			System.out.println(s);
		}
		
		System.out.println(hs.isEmpty());
		
		hs.clear(); //used to clear the content of the hashset.
		System.out.println(hs.isEmpty());
		
		
		
		
	}

}

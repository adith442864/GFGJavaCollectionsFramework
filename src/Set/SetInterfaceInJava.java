package Set;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceInJava {

	public static void main(String[] args) {
		
		// order of items is different: no predefined...
		// does not allow duplicates.
		
		Set<Integer> s = new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(20);
		
		System.out.println(s);

	}

}

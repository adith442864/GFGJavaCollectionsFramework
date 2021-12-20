package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapConcept {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> m = new LinkedHashMap<Integer,String>(); 
		m.put(10, "gfg");
		m.put(20, "ide");
		m.put(15, "courses");
		
		System.out.println(m);
		
		m.remove(20);
		m.put(20, "practice");
		System.out.println(m);
		
		//special constructor:
		//1 param : capacity, 2 param: load factor, 3 param : access order
		LinkedHashMap<Integer, String> m1 = new LinkedHashMap<Integer,String>(4,0.5f,true);
		m1.put(10, "A");
		m1.put(20, "B");
		m1.put(15, "C");
		
		System.out.println(m1.get(10));
		System.out.println(m1);
		
		m1.put(20,"practice");
		System.out.println(m1);

	}

}

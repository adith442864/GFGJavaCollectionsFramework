package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapInterfaceDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new TreeMap<Integer,String>();
		
		m.put(100, "GfG");
		m.put(200, "Courses");
		m.put(300, "IDE");
		
		System.out.println(m);
		
		System.out.println(m.get(100));
		
		
		
		
		
		
		

	}

}

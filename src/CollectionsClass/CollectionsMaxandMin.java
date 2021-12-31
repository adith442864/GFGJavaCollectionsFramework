package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Point implements Comparable<Point>{
	
	int x, y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public int compareTo(Point p) {
		return this.x-this.y;
	
	}

}


public class CollectionsMaxandMin {
	
	public static void main(String args[]) {
		
		 // Creating a list of ArrayList type
	    List<Integer> al = new ArrayList<Integer>();
	
	    // Adding element to the lisusing add() method
	    al.add(10);
	    al.add(5);
	    al.add(20);
		
		System.out.println(Collections.max(al));
		
		System.out.println(Collections.min(al));
		
		//comparable interface:
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(5,20));
		list.add(new Point(25,10));
		list.add(new Point(15,40));
		
		Point p = Collections.max(list);
		System.out.println(p.x +" "+p.y);
		
	}

}

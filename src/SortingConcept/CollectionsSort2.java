package SortingConcept;

import java.util.*; 
import java.io.*; 

//A user-defined Point class implementing 
//Comparable interface
	 class point1 implements Comparable<point1>
	{
	 int x, y;
	 public point1(int x, int y)
	 {
	     this.x = x;
	     this.y = y;
	 }
	 
	 // compareTo() function defining the
	 // nature of sorting i.e., according to
	 // x-coordinate

	@Override
	public int compareTo(point1 o) {
		return this.x-o.x;
	}
	}

	public class CollectionsSort2 
	{ 
	 
	public static <T> void main(String[] args) 
		{ 
     // Create a list of Integers 
     List<point1> list = new ArrayList<point1>(); 
     
     list.add(new point1(5, 10)); 
     list.add(new point1(2, 20));  
     list.add(new point1(10, 30)); 
     
     // List is sorted in the natural order
    Collections.sort(list);
     
     // Displaying the points
     for (point1 p: list)
         System.out.println(p.x + " " + p.y);
	} 

}
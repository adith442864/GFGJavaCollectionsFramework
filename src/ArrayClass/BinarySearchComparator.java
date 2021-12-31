package ArrayClass;

import java.util.Arrays;
import java.util.Comparator;

// Point class which does not implement
//Comparable interface. Thus the objects
//of this class are not comparable.

	class Point1
	{
	 int x, y;
	 
	 // Costructor intialising x & y
	 
	 Point1(int x, int y)
	 {
	     this.x = x;
	     this.y = y;
	 }
	 
	}
	
	//This class implements 
	//Comparator interface to compare 
	
	class MyCmp implements Comparator<Point1>
	{
	 // Sorts the Point objects according
	 // to x-coordinates in natural order
		
	 public int compare(Point1 p1, Point1 p2)
	 {
	     // Considered the natural order 
	     return p1.x - p2.x;
	 }
	}
	
	//Main class
	public class BinarySearchComparator {
		
		public static void main(String[] args) {
			
			 // Array of 3 objects
	        Point1 arr[] = {
	            new Point1(10, 20), 
	            new Point1(20, 15), 
	            new Point1(25, 5),
	            new Point1(40, 100)};
	            
	        Point1 p = new Point1(25, 5);
	
	        // An extra parameter is passed with the
	        // object of MyCmp class
	        System.out.println(Arrays.binarySearch(
	            arr, p, new MyCmp()));
			
		}

}

package SortingConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//This class implements 
//Comparator interface
class MyCmp1 implements Comparator<Point>
{
 // Sorts the Point objects according
 // to x-coordinates in natural order
 public int compare(Point p1, Point p2)
 {
     return p1.x - p2.x;
 }
}

//Main Class
class CollectionsSort3 
{ 
 public static void main(String[] args) 
 { 
     // Create a list of Integers 
     List<Point> list = new ArrayList<Point>(); 
     list.add(new Point(5, 10)); 
     list.add(new Point(2, 20));  
     list.add(new Point(10, 30)); 
     
     // List is sorted in natural order
     // Passing the list and MyCmp object
     Collections.sort(list, new MyCmp1());
     
     // Displaying the points
     for (Point p: list)
         System.out.println(p.x + " " + p.y);
 	} 

}
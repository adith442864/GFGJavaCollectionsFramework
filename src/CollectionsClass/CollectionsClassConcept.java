package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassConcept {
	
	 public static void main (String[] args) 
	    {
	        // Creating a list of ArrayList type
	        List<Integer> l = new ArrayList<>();

	        // Adding element to the lisusing add() method
	        l.add(10);
	        l.add(5);
	        l.add(30);
	        
	        // Sorting the list in the natural order
	        Collections.sort(l);
	        System.out.println(l);

	        // Reversing the content of the list        
	        Collections.reverse(l);
	        System.out.println(l);
	    }

}

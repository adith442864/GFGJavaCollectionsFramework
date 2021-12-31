package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsFill {
	
	public static void main(String args[]) {
	
		 // Creating a list of ArrayList type
	    List<Integer> al = new ArrayList<Integer>();
	
	    // Adding element to the lisusing add() method
	    al.add(10);
	    al.add(5);
	    al.add(30);
	    
	    //fill the list
	    Collections.fill(al, 5);
	    
	    System.out.println(al);
	    
	  
	}

}

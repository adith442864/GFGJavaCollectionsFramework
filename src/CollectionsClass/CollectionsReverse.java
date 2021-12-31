package CollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsReverse {
	
	public static void main(String args[]) {
		
		 // Creating a list of ArrayList type
	    List<Integer> al = new ArrayList<Integer>();
	
	    // Adding element to the lisusing add() method
	    al.add(10);
	    al.add(5);
	    al.add(30);
	    
	    System.out.println(al);
	    
	    Collections.reverse(al);
	    System.out.println(al);
	    
	  System.out.println("-------------");
	    
	 // Create an array of integers
        Integer arr[] = {10, 20, 30};
        
        // creating List<Integer> 
        List<Integer> list = Arrays.asList(arr);
        
        // Printing array
        System.out.println(Arrays.toString(arr));
        
        // Reversing the list
        Collections.reverse(list);
        
        // Printing array
        System.out.println(Arrays.toString(arr));
	    
	    
	    
	    
	}

}

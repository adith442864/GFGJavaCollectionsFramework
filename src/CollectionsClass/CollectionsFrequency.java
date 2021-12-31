package CollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsFrequency {
	
	public static void main(String args[]) {
		
		 // Creating a list of ArrayList type
	    List<Integer> al = new ArrayList<Integer>();
	
	    // Adding element to the lisusing add() method
	    al.add(10);
	    al.add(20);
	    al.add(10);
	    
	    System.out.println(Collections.frequency(al, 10));
	    
	    //freq in normal array:
	    Integer arr[] = {10,5,10,20};
	    
	   int res = Collections.frequency(Arrays.asList(arr), 10);
	   System.out.println(res);
	    
	}
}

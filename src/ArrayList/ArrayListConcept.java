package ArrayList;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		// Dynamic size
		// Rich library functions
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		
		System.out.println(al.size());
		
		System.out.println(al);
		
		// Internally use array only
		// if array became full, do the following:
			//1. create a new array of double size
			//2. copy elements from old space to new
			//3. Free old space..
		 
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.ensureCapacity(100); //pre allocates memory
        for(int i = 1;i<=100;i++)
        al1.add(i);
        System.out.println(al1);
		

	}

}

package ArrayClass;

import java.util.Arrays;

public class ArraysEqualsMethod {

	public static void main(String[] args) {
		
		int a[]= {10,15,20};
		int b[]= {10,15,20};
		int c[]= {15,10,12};
		
		if(Arrays.equals(a, b))
			System.out.println("yes");
		else
			System.out.println("no");
		
		if(Arrays.equals(a, c))
			System.out.println("yes");
		else
			System.out.println("no");
		
		//Non Primitive:
		Integer a1[]= {10,15,null,30};
		Integer b1[]= {10,15,null,30};
		
		if(Arrays.equals(a1, b1))
			System.out.println("yes");
		else
			System.out.println("no");
		
		
		//compare sub-array of two arrays:
		
		Integer a2[]= {10,20,30,40,60};
		Integer b2[]= {30,40,60,5,8};
		
		if(Arrays.equals(a2, 2, 5, b2, 0, 3))
			System.out.println("yes");
		else
			System.out.println("no");
		
		
		//Array Equals on Strings:
		
		String s1[]= {"GFG","IDE"};
		String s2[]= {"gfg","ide"};
		
		if(Arrays.equals(s1, s2, String::compareToIgnoreCase))
			System.out.println("yes");
		else
			System.out.println("no");
		
		
		
		
		
		
		
	}
	
	
	
	
	

}

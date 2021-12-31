package ArrayClass;

import java.util.Arrays;

public class ArraysMismatchMethod {

	public static void main(String[] args) {
		
		int a[]= {10,20,30};
		int b[]= {10,23,30};
		int c[]= {10,20,40,30};
		
		System.out.println(Arrays.mismatch(a, b));
		System.out.println(Arrays.mismatch(a, c));
		
		System.out.println(Arrays.mismatch(a,0,2,b,0,2));
		
		//non primitive array with comparator mismatch
		
		String s1[]= {"GeeksforGeeks","IDE"};
		String s2[]= {"geeksforgeeks","Courses"};
		
		System.out.println(Arrays.mismatch(s1, s2,String::compareToIgnoreCase));
		
		


	}

}

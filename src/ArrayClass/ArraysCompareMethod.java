package ArrayClass;

import java.util.Arrays;

public class ArraysCompareMethod {
	
	public static void main(String args[]) {
		
//		int a[]= {10,20,15};
//		int b[]= {10,20,30};
		
		Integer a[]= {10,20,null,30};
		Integer b[]= {10,20,-30,40};
		
		
		int res = Arrays.compare(a, b);
		if(res==0)
			System.out.println("same");
		else if(res>0)
			System.out.println("a is greater");
		else if(res<0)
			System.out.println("a is smaller");
		
		//Sub Array:

		Integer a1[]= {10,20,30,40,50};
		Integer b1[]= {10,20,30,35,80};
		
		
		
		int res1 = Arrays.compare(a1,0,3,b1,0,3);
		if(res1==0)
			System.out.println("same");
		else if(res1>0)
			System.out.println("a1 is greater");
		else if(res1<0)
			System.out.println("a1 is smaller");
		
		System.out.println("----------------");
		
		String s1[]= {"GFG","IDE"};
		String s2[]= {"gfg","ide"};
		
		// Comparing using our own comparator
        // where we have ignored the cases
        if(Arrays.compare(s1, s2, String::compareToIgnoreCase) == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
	
		
	}

}

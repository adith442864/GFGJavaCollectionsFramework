package ArrayClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArraysAsListMethod {

	public static void main(String[] args) {
		
		String arr[]= {"GFG","IDE","Courses"};
		
		List<String> list = Arrays.asList(arr);
		System.out.println(list);
		
		arr[0]="Practice";
		System.out.println(list);
		
		list.set(1, "Premium");
		System.out.println(Arrays.toString(arr));
		
		//reversing an array:
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.toString(arr));
		
		//HashSet
		HashSet<String> s = new HashSet<>(Arrays.asList(arr));
		System.out.println(s);
		
		//integer 
		int a[]= {10,20,30};
		System.out.println(a); //[I@4dc63996
		System.out.println(Arrays.toString(a));

	}

}

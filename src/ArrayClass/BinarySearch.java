package ArrayClass;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {10,20,25,30,40};
		
		System.out.println(Arrays.binarySearch(arr, 20));
		System.out.println(Arrays.binarySearch(arr, 0,3,25));
		System.out.println(Arrays.binarySearch(arr, 22)); 
		// -(InsertionPoint+1) -> 2+1=-3
		

	}

}

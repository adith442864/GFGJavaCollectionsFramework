package Set;

import java.util.HashSet;

public class PrintDistinctElementsEfficient {
	
	public static void printDist(int arr[]) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0; i<arr.length; i++) {
			
			if(hs.contains(arr[i])==false) {
				System.out.print(arr[i]+" ");
				hs.add(arr[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		//Print distinct elements from the given array:
		
		int arr[]= {10,8,10,10,7};
		
		printDist(arr);

	}

}

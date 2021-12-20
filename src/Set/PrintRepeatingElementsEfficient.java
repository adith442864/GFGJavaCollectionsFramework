package Set;

import java.util.HashSet;

public class PrintRepeatingElementsEfficient {
	
	public static void printRepeating(int arr[]) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(hs.contains(arr[i])==true) 
				System.out.println(arr[i]+" ");
				else {
					hs.add(arr[i]);
				}
		}
		
		
	}

	public static void main(String[] args) {
		
		int arr[]= {10,8,10,8};
		
		printRepeating(arr);

		

	}

}

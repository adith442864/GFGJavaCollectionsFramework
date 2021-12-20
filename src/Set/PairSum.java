package Set;

import java.util.HashSet;

public class PairSum {
	
	public static boolean isPair(int arr[], int sum) {
		
		for(int i=0; i<arr.length; i++) 
			
			for(int j=1; j<arr.length; j++) 
				
				if(arr[i]+arr[j]==sum)
					return true;
			
			return false;	
	}
	
	
	public static boolean isPairHash(int arr[], int sum) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(hs.contains(sum-arr[i]))
				return true;
		else 
			hs.add(arr[i]);
		}	
		
		return false;
		
	}

	public static void main(String[] args) {
		
		int arr[]= {3,2,8,15,-8};
		int sum=17;
		
		System.out.println(isPair(arr, sum));
		System.out.println(isPairHash(arr, sum));

	}

}

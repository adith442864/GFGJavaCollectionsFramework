package SortingConcept;

import java.util.Arrays;

public class ChoclateDistribution {
	
	 static int findMinDiff(int arr[], int m) 
	 { 

		if(m>arr.length)
			return Integer.MAX_VALUE;
		 
		Arrays.sort(arr);
		
		int res = arr[m-1]-arr[0];
		
		for(int i=1; (i+m-1)<arr.length; i++)
			res=Math.min(res, (arr[i+m-1]-arr[i]));
		return res;
	 }	 
	
	public static void main(String[] args)  
	{ 
	int arr[] = {4, 2, 5, 7, 11, 10, 9}; 
	
	int m = 3;  
	
	int n = arr.length; 
	System.out.println(findMinDiff(arr,m)); 
	
	} 

}

package ArrayClass;

import java.util.Arrays;

public class GFG {

	public static void main(String[] args) {
		
		int a[]= {10,20,30};
		int b[]= {10,20,30};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.toString(a));
		
		//fill with 1D array:
		int arr[]= {10,20,30,40};
		Arrays.fill(arr, 1,3,-1);
		System.out.println(Arrays.toString(arr));
		
		
		//Collections.fill(list,val);
		
		
		//fill with multi dimensional array:
		int[][] ar = new int[3][4];
		for(int[]row: ar) {
			Arrays.fill(row, 1);
		}
		System.out.println(Arrays.deepToString(ar));
		
		
		
		
		
		
		

	}

}

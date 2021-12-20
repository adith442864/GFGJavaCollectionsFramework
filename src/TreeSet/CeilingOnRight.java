package TreeSet;

import java.util.TreeSet;

public class CeilingOnRight {
	
	public static void printCeilingRight(int arr[]) {
		int n= arr.length;
		
		for(int i=0; i<n; i++) {
			
			int diff = Integer.MAX_VALUE;
			
			for(int j=i+1; j<n; j++)
				
				if(arr[j]>=arr[i])
					
					diff=Integer.min(diff,arr[j]-arr[i]);
				
			if(diff==Integer.MAX_VALUE)
				System.out.print(-1+" ");
			else
				System.out.print((arr[i]+diff)+" ");
			
			System.out.println();
		}
	}
	
	
	
	
	public static void printCeilingright(int arr[]) {
		int n= arr.length;
		
		TreeSet<Integer> s = new TreeSet<Integer>();
		
		int res[] = new int[n];
		
		for(int i=n-1; i>=0; i--) {
			
			Integer ceil = s.ceiling(arr[i]);
			
			if(ceil==null)
				res[i]=-1;
			else
				res[i]=ceil;
			s.add(arr[i]);
		
		}
		
		for(int x: res)
			System.out.print(x+" ");
		
	}
	

	public static void main(String[] args) {
		
		
		int arr[] = {100,50,30,60,55,32};
		
		printCeilingRight(arr);
		printCeilingright(arr);

	}

}

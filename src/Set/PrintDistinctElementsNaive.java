package Set;

public class PrintDistinctElementsNaive {
	
	public static void printDist(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			boolean flag = false;
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					flag=true;
					break;
				}
			}
			
			if(flag==false) {
				System.out.print(arr[i]+" "); //10 8 true true 7 
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		//Print distinct elements from the given array:
		
		int arr[]= {10,8,10,10,7};
		
		printDist(arr);
		

	}

}

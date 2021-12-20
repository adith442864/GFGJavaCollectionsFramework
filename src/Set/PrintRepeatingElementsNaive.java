package Set;

public class PrintRepeatingElementsNaive {
	
	public static void printRepeating(int arr[]) {
		
		for(int i=1; i<arr.length; i++) {
			boolean flag = false;
			
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					flag=true;
					break;
				}
			}
			
			if(flag==true) {
				System.out.println(arr[i]+ " ");
			}
		}
		
		
		
		
	}

	public static void main(String[] args) {
		
		int arr[]= {10,8,10,8};
		
		printRepeating(arr);

		

	}

}

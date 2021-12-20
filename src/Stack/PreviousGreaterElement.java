package Stack;

public class PreviousGreaterElement {
	
	public static void previousElement(int arr[]) {
		
		for(int i=0; i<arr.length; i++) 
		{
			int span=-1;
			
			for(int j=i-1; j>=0; j--) 
			{
				
				if(arr[j] > arr[i]) 
				{
					span=arr[j];
					break;
				}
			}
			
			System.out.print(span+" ");
		}
		
	}

	public static void main(String[] args) {
		
		int arr[]= {15,10,18,12,4,6,2,8};
		previousElement(arr);

	}

}

package Stack;

public class NextGreaterElementNaive {
	
	public static void previousElement(int arr[]) {
		
		for(int i=0; i<arr.length; i++) 
		{
			int span=-1;
			
			for(int j=i+1; j<arr.length; j++) 
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
		
		int arr[]= {5,15,10,8,6,12,7};
		previousElement(arr);

	}

}

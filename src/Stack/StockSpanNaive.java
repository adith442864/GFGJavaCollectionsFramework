package Stack;

public class StockSpanNaive {
	
	public static void printSpan(int arr[]) {
		
		for(int i=0; i<arr.length; i++) 
		{
			int span=1;
			for(int j=i-1; j>=0; j--) {
				if(arr[j]<=arr[i])
					span++;
				//break;
			}
			
			System.out.print(span+" ");
		}
		
		
		
	}

	public static void main(String[] args) {
		
		int arr[]= {18,12,13,14,11,16}; //1 
		printSpan(arr);

	}

}

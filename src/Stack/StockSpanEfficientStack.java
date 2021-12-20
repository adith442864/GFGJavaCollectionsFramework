package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StockSpanEfficientStack {
	
	 static void prevGreater(int arr[])
	    {
	        Deque<Integer> stack = new ArrayDeque<Integer>();
	        
	        stack.push(arr[0]);
	        int span = 1;
	        
	        System.out.print(span + " ");
	        
	        for(int i = 1; i < arr.length; i++)
	        {
	            while(stack.isEmpty()==false 
	            		&& stack.peek() <= arr[i])
	            {
	                stack.pop();
	            }
	                
	            span = (stack.isEmpty())? -1 :  stack.peek(); 
	            System.out.print(span + " ");
	            
	            stack.push(arr[i]);
	        }
	    }
	    
	    public static void main (String[] args) {
	        int arr[] = {60, 10, 20, 40, 35,30,50,70,65};
	        
	        prevGreater(arr);
	        
	    }

}

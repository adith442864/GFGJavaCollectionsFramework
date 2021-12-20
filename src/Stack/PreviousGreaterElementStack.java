package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreviousGreaterElementStack {
	
	 
    static void prevGreater(int arr[])
    {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        
        stack.push(arr[0]);
        int pg = -1;
        
        System.out.print(pg + " ");
        
        for(int i = 1; i < arr.length; i++)
        {
        	//remove all items which are smaller than or equal to from stack:
        	// if stack is empty, no need to do anything..
            while(stack.isEmpty()==false && stack.peek() <= arr[i])
            {
                stack.pop();
            }
                
            pg = (stack.isEmpty())? -1 :  stack.peek(); 
            System.out.print(pg + " ");
            
            stack.push(arr[i]);
        }
    }
    
    public static void main (String[] args) {
        int arr[] = {20, 30, 10, 5, 15};
        
        prevGreater(arr);
        
    }

}

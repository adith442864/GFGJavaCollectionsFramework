package Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class PrintFrequenciesHashMap {
	
	
 static void printFrequencies(int arr[])
    {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        
        for(int i=0; i<arr.length; i++)
        {
            m.put(arr[i], m.getOrDefault(arr[i],0) + 1);
        }
        
        for(Entry x : m.entrySet())
        {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
    
    public static void main(String args[])
    {
        int arr[] = {10, 5, 20, 5, 10, 5};
        printFrequencies(arr);
    }

}

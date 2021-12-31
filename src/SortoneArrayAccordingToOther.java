

import java.util.Arrays;
import java.util.Comparator;

class Pair {
	    int first;
	    char second;
	    
	    Pair(int f, char s)
	    {
	        first = f;
	        second = s;
	    }
	}
	
	class mycmp1 implements Comparator<Pair>
	{
	    public int compare(Pair p1, Pair p2)
	    {
	        return p1.first - p2.first;
	    }
	}
	
	class SortoneArrayAccordingToOther {
	    
	    static void sortAccordingToOther(int a[], char b[])
	    {
	       int n = a.length;
	       
	       Pair arr[] = new Pair[n];
	       
	       for(int i=0; i<n; i++)
	       {
	           arr[i] = new Pair(a[i], b[i]);
	       }
	       
	       Arrays.sort(arr, new mycmp1());
	       
	       for(int i=0; i<n; i++)
	       {
	           b[i] = arr[i].second;
	       }
	    }
	    
	    public static void main(String args[])
	    {
	        int a[] = {10, 15, 5};
	        char b[] = {'x', 'y', 'z'};
	    
	        sortAccordingToOther(a, b);
	        
	        for(int i = 0; i<b.length; i++)
	            System.out.print(b[i] + " ");
	    }

}
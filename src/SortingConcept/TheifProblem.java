package SortingConcept;

import java.util.Arrays;
import java.util.Collections;

public class TheifProblem {

	static int getMaxVal(Integer arr[], int K)
    {
       Arrays.sort(arr, Collections.reverseOrder());
       
       int res = 0;
       
       for(int i=0; i<K; i++)
       {
           res += arr[i];
       }
       
       return res;
    }
    
    public static void main(String args[])
    {
        Integer arr[] = {3, 7, 2, 5, 12, 30};
        int K = 3;
        
        System.out.println(getMaxVal(arr, K));
    }

}

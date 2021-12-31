package SortingConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ArrItem {
    int item;
    int index;
    
    ArrItem(int im, int ix)
    {
        item = im;
        index = ix;
    }
}

class MyCmp2 implements Comparator<ArrItem>
{
    public int compare(ArrItem i1, ArrItem i2)
    {
        return i1.item - i2.item;
    }
}

class KeepIndexAfterSorting {
    
    static void printSortedWithIndexes(int arr[])
    {
       int n = arr.length;
       
       ArrayList<ArrItem> al = new ArrayList<ArrItem>(n);
       
       for(int i=0; i<n; i++)
       {
           al.add(new ArrItem(arr[i], i));
       }
       
       Collections.sort(al, (ai1,ai2) -> (ai1.item - ai2.item));
       
       for(ArrItem x: al)
       {
           System.out.println(x.item + " " + x.index);
       }
    }
    
    public static void main(String args[])
    {
        int arr[] = {20, 10, 5, 4};
    
        printSortedWithIndexes(arr);
    }

}
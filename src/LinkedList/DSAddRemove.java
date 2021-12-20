package LinkedList;


import java.util.Iterator;
import java.util.LinkedList;

public class DSAddRemove {
	
	LinkedList<Integer> list = new LinkedList<>();
    
    void add(int x)
    {
        list.add(x);
    }
    
    void removeAndPrint(int x)
    {
        Iterator it= list.iterator();
        
        while(it.hasNext())
        {
            Integer n = (Integer)it.next();
            
            if(n.equals(x))
            {
                it.remove();
            }
            else
            {
                System.out.print(n+" ");
            }
        }
        System.out.println();
    }
		
	

	public static void main(String[] args) {
		
		
		DSAddRemove ds = new DSAddRemove();
		ds.add(10);
		ds.add(20);
		ds.add(10);
		
		ds.removeAndPrint(10);
		
		

	}

}

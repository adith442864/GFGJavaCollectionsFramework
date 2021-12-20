package Set;

import java.util.HashSet;

public class IntersectionConcept {
	
	public static void intersection(int a[], int b[]) {
		
		for(int i=0; i<a.length; i++) {
			boolean flag = false;
			
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					flag=true;
				break;
				}
			}
			
			if(flag==true) {
				System.out.println(a[i]+" ");
			}
			
		}
		
	}
	
	public static void intersectionHash(int a[], int b[]) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0; i<b.length; i++) {
			hs.add(b[i]); 
		}
		
		for(int i=0; i<a.length; i++) {
			if(hs.contains(a[i]))
				System.out.println(a[i]+" "); 
			//if b elements there in a array then, print the element
		}
	
	}
	

	public static void main(String[] args) {
		
		int a[] = {10,15,20,25,30,50};
		int b[] = {30,5,15,80};
		
		intersection(a, b);
		
		System.out.println("--------");
		intersectionHash(a, b);
		

	}

}

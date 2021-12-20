package ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		//1. Integer:
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println(al.size());
		
		//add:
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		
		System.out.println(al.size());
		System.out.println(al.get(0));
		
		
		// 2. String:
		ArrayList<String> al1 = new ArrayList<String>();
		
		al1.add("geeks");
		al1.add("ide");
		al1.add("courses");
		
		System.out.println(al1);
		al1.add(1, "practice"); //inserting at 1st index pos..
		System.out.println(al1);
		System.out.println(al1.size());
		
		//contain:
		System.out.println(al1.contains("geeks"));
		
		//remove:
//		al.remove(1);
//		System.out.println(al);
//		System.out.println(al.contains(20)); //false
		
		System.out.println(al1);
		al1.remove(1);
		System.out.println(al1.contains("ide"));
		System.out.println(al1);
		al1.remove("courses");
		System.out.println(al1);
		
		
		//get
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		
		
		//set
		al.set(1, 40); //replace the previous value with the new value:
		System.out.println(al.get(1));
		
		
		
		//indexof
		System.out.println(al.indexOf(10));
		System.out.println(al.indexOf(50)); //-1, not there in the array list
		
		
		//lastindexof()
		System.out.println(al.lastIndexOf(10));
		
		//clear
		al.clear();
		System.out.println(al);
		
		//isEmpty()
		System.out.println(al.isEmpty());
		

	}

}

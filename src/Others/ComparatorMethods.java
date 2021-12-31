package Others;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorMethods {
	
	public static void main(String args[]) {
		
//		String arr[]= {"gfg",null,"ide",null};	
//		Arrays.sort
//		(arr,Comparator.nullsFirst(Comparator.naturalOrder()));
//		
//		System.out.println(Arrays.toString(arr));
		
//		String arr[]= {"gfg","courses","ide"};
		
//		Arrays.sort(arr,Comparator.reverseOrder());
		
//		System.out.println(Arrays.toString(arr));
		
		 // Arrays of Students with name and rollNo
        Student arr[] = {new Student("abc", 120), 
                        new Student("xyz", 110), 
                        new Student("abc", 101)};
        
        // Sorting first by name and then by rollNo
        Arrays.sort(arr, 
        		Comparator.comparing(Student::getName)
        		.thenComparing(Student::getRollNo));
        
        // Displaying the Arrays
        System.out.println(Arrays.toString(arr));
		
	}

}


class Student{
	
	//Having name and roll number
	String name;
	int rollNo;
	
	Student(String n, int r){
		name=n;
		rollNo=r;
	}

	public String getName() {
		return name;
	}

	
	public int getRollNo() {
		return rollNo;
	}

	
	public String toString() {
		return "("+name+" " +rollNo+")";
		
	}
	
	
	
	
}

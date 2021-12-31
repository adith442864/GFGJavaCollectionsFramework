package SortingConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	
	int rollNo;
	int marks;
	
	public Student(int r, int m) {
		rollNo = r;
		marks = m;
		}
	
	}

	class mycmp3 implements Comparator<Student> {
		
		public int compare(Student s1, Student s2) {
			return s2.marks-s1.marks;
		}	
	}
	
	
 class SortStudentMarks {
	 
	 static void printMarks(int roll[], int marks[]) {
		 
		 int n = roll.length;
		 List<Student> al = new ArrayList<Student>(n);
		 
		 for(int i=0; i<n; i++) {
			 al.add(new Student(roll[i],marks[i]));
		 }
		 
		 Collections.sort(al, new mycmp3());
		 
		 for(Student x : al) {
			 System.out.println(x.rollNo + " "+x.marks);
		 }
		 
		 
	 }
	 
	 
	 public static void main(String args[]) {
		 
		 int roll[] = {101,108,103,105};
		 int marks[] = {70,80,40,90};
		 
		 printMarks(roll, marks);
		 
		 
	 }
 }
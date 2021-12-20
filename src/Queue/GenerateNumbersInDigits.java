package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateNumbersInDigits {
	
	public static void printFirstN(int n) {
		
		Queue<String> q = new LinkedList<String>();
		
		q.add("5");
		q.add("6");
		
		for(int count=0; count<n; count++) {
			
			String curr = q.poll();
			
			System.out.print(curr+" ");
			q.add(curr+"5");
			q.add(curr+"6");
		}
		
	}

	public static void main(String[] args) {
		
		int n=4;
		printFirstN(n);

	}

}

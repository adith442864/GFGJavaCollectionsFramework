package Others;

import java.util.Arrays;

public class ComparatorWithMethodReference {

	public static void main(String[] args) {
		
		String arr[]= {"gfg","IDE","GFG"};
		
		Arrays.sort(arr,String::compareToIgnoreCase);
		
		for(String s: arr) {
			System.out.println(s+" ");
		}

	}

}

package Strings;

public class StringMethods {

	public static void main(String[] args) {
		
		char []arr = {'g','e','e','k','s'};
		
		//immutable -- cannot be modified.
		/*
		String str ="geeks";
		String str1 = new String("geeks");
		
		StringBuffer str2 = new StringBuffer("geeks"); //thread-safe
		
		StringBuilder str3 = new StringBuilder("geeks"); //not thread-safe
		*/
		
		String str = "geeks";
		System.out.println(str.length());
		
		System.out.println(str.charAt(2));
		System.out.println(str.substring(2));
		
		System.out.println(str.substring(2, 5));
		
		String s1="geeks";
		String s2="geeks";
		
		//string literals:
		if(s1==s2) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		String s3=new String("geeks");
		if(s1==s3) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		//equals()
		System.out.println(s1.equals(s2));
		
		//contains
		System.out.println(s1.contains(s2));
		
		//compareTo()
		
		String s4="geeksforgeeks";
		String s5="geeks";
		
		int res = s4.compareTo(s5);
		if(res==0) {
			System.out.println("same");
		}else if(res>0) {
			System.out.println("s4 greater");
		}else if(res<0) {
			System.out.println("s4 smaller");
		
		}
		
		//indexOf()
		System.out.println(s4.indexOf(s5));
		System.out.println(s4.indexOf(s5,1));
		
		String s6="geeks";
		String s7=s6;
		
		s6=s6+"forgeeks";
		System.out.println(s6);
		System.out.println(s6==s7);
		
		

	}

}

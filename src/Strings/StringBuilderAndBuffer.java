package Strings;

public class StringBuilderAndBuffer {

	public static void main(String[] args) {
		
		String s1="geeks";
		String s2=s1;
		
		s1=s1.concat("forgeeks");
		System.out.println(s1);
		
		System.out.println(s1==s2);
		
		//mutable 
		StringBuilder sb1 = new StringBuilder("geeks");
		StringBuilder sb2=sb1;
		
		sb1=sb1.append("forgeeks");
		
		if(sb1==sb2) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		/*
		 * common methods:
		 * length(), charAt(index), indexOf(str), indexOf(str, fromIndex)
		 * lastIndexOf(str), lastIndexOf(str,fromIndex), compareTo(sb)
		 * subString(beginIndex), subString(beginIndex,endIndex), chars()
		 * 
		 * New methods:
		 * append(x), insert(offset,x), setCharAt(index,c), reverse()
		 * deleteCharAt(index), delete(start,end)
		 * capacity(), replace(start,end,str)
		 */
		
		StringBuilder sb = new StringBuilder("dcba");
		System.out.println(sb.reverse());
		
		sb.append("efg");
		System.out.println(sb);
		
		sb.setCharAt(1, 'h');
		System.out.println(sb);
		
		sb.delete(0, 2);
		System.out.println(sb);
		
		sb.insert(1, "efg");
		System.out.println(sb);

	}

}

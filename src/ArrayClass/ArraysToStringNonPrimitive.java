package ArrayClass;

import java.util.Arrays;

class Point2{
	
	int x,y;
	
	public Point2(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		 return "(" + x + ", " + y + ")";
	}
	
	
	
	
	
}
	public class ArraysToStringNonPrimitive {
		
		public static void main(String args[]) {
			
			Point2 arr[]= {new Point2(10,20), new Point2(5,30)};
			System.out.println(Arrays.toString(arr));
		}
	
	}

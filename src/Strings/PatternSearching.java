package Strings;

public class PatternSearching {
	
	public static void patSearch(String txt, String pat) {
		
		int pos = txt.indexOf(pat);
		
		while(pos>=0) {
			System.out.println(pos+" ");
			pos=txt.indexOf(pat, pos+1);
		}
		
		
		
	}
	
	public static String digitsAfterDecimal(String no) {
		
		int pos = no.indexOf('.');
		
		if(pos < 0) {
			return "";
		}
		else {
			return no.substring(pos+1);
		}
				
	}

	public static void main(String[] args) {
		
		String txt = "geeks for geeks";
		String pat = "geeks";
		
		patSearch(txt, pat);
		
		
		String no = "12.348";
		System.out.println(digitsAfterDecimal(no));
		

	}

}

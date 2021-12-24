package Strings;

import java.util.Arrays;

public class FindExtraCharacter {
	
	//1. using Sorting
	public static char findExtraSorting(String s1, String s2) {
		
		char a1[] = s1.toCharArray();
		Arrays.sort(a1);
		
		char a2[] = s2.toCharArray();
		Arrays.sort(a2);
		
		int n=s1.length();
		for(int i=0; i<n; i++) {
			if(a1[i]!=a2[i])
				return a2[i];
		}
		
		return a2[n];	
		
	}
	
	
	//2. using Counting:
	static char findExtra(String s1, String s2)
    {
        int count[] = new int[26];
        
        int n = s1.length();
        
        for(int i=0; i<n; i++)
        {
            count[s2.charAt(i) - 'a']++;
            count[s1.charAt(i) - 'a']--;
        }
        
        count[s2.charAt(n) - 'a']++;
        
        for(int i=0; i<26; i++)
        {
            if(count[i] == 1)
                return (char)(i + 'a');
        }
        
        return 0;
    }
	
	
	//3. using Bitwise
	static char findExtraBitwise(String s1, String s2)
    {
        int res =0;

        int n = s1.length();

        for(int i=0;i<n;i++)
        {
            res = res ^ s1.charAt(i) ^ s2.charAt(i);
        }

        res = res ^ s2.charAt(n);

        return (char)res;
    }
	
	

	public static void main(String[] args) {
		
		String s1 = "abcd";
		String s2="abcda";
		
		System.out.println(findExtraSorting(s1, s2));
		
		System.out.println(findExtra(s1, s2));
		
		
		

	}

}

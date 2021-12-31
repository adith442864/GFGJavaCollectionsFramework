package SortingConcept;

import java.util.Arrays;

public class MeetingMaxGuest {

	static int maxCount(int[] arr, int dep[])
	{
		Arrays.sort(arr);
		Arrays.sort(dep);

		int n  = arr.length;

		int i = 1, j = 0, res = 0, curr = 1;

		while(i<n && j<n)
		{
			if(arr[i]<=dep[j])
			{
				curr++; 
				i++;
			}
			else
			{
				curr--; j++;
			}

			res = Math.max(res, curr);
		}
		
		return res;
	}
	public static void main (String[] args) {
		
		int[] arr = {900, 700, 600};
		int[] dep = {1000, 800, 730};

		

		System.out.println(maxCount(arr,dep));
	}

}

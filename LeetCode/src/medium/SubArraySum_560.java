package medium;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum_560 {
	
	public static void main(String[] args) {
		
		/*
		Input: nums = [1,1,1], k = 2
				Output: 2

				Example 2:

				Input: nums = [1,2,3], k = 3
				Output: 2
*/
	}
	
	public int subarraySum(int[] arr, int k) {
		
		int count = 0, curSum = 0;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer> ();
		for(int i=0; i<arr.length; i++) {
			
			curSum+=arr[i];
			
			if(map.containsKey(curSum-k)) {
				count+=map.get(curSum-k);
			}
			map.put(curSum, map.getOrDefault(curSum, 0)+1);
		}
		
		
		return count;
	}

}

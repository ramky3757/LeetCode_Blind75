package medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReOrganizeString_767 {

	public static void main(String[] args) {
		
		/*
		Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.

		Return any possible rearrangement of s or return "" if not possible.

		 

		Example 1:

		Input: s = "aab"
		Output: "aba"
		Example 2:

		Input: s = "aaab"
		Output: ""
				+ ""
				+ ""
				*/
		
		ReOrganizeString_767 re = new ReOrganizeString_767();
		System.out.println(re.reArrange("aab"));
		
	}
	
	
	public String reArrange(String str) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer> ();
		
		for(char c: str.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}

		PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
				(a,b) -> b.getValue() - a.getValue());
		
		maxHeap.addAll(map.entrySet());
		
		Map.Entry<Character, Integer> prev = null;
		StringBuilder result = new StringBuilder();
		
		while(!maxHeap.isEmpty()) {
			
			Map.Entry<Character, Integer> curr = maxHeap.poll();
			
			// check if previous entry has value if it does add it to the maxheap.
			if(prev!=null && prev.getValue() > 0) {
				maxHeap.offer(prev);
			}
			
			result.append(curr.getKey());
			curr.setValue(curr.getValue()-1);
			
			// make current entry as previous entry until next char from map is picked up.
            // this is to avoid same char coming next to each other and also putting it back for next turn.
			
			prev = curr;
		}
		
		
		return result.length() == str.length() ? result.toString() : "";
		
	}

}

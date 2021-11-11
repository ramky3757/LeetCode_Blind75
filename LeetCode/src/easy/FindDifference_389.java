package easy;

import java.util.HashMap;

public class FindDifference_389 {

	public static void main(String[] args) {
		
		
		String s = "a", t = "aae";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer> ();
		
		for(char c: s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char c: t.toCharArray()) {
			
			if(map.containsKey(c) && map.get(c) == 0 || !map.containsKey(c)) {
				System.out.println(c);
				
			} else {
				map.put(c, map.get(c)-1);
			}
			
		}
		
	}

}



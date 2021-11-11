package medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency_451 {

	public static void main(String[] args) {
		
		/*
		
		Input: s = "tree"
				Output: "eert"
				Explanation: 'e' appears twice while 'r' and 't' both appear once.
				So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
				
				*/
		

	}
	
public String frequencySort(String s) {
        
        Map<Character, Integer> map = new HashMap<Character, Integer> ();
        
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
           (a,b) -> b.getValue() - a.getValue());
        
        maxHeap.addAll(map.entrySet());
        StringBuilder result = new StringBuilder();
        
        while(!maxHeap.isEmpty()){
            Map.Entry<Character, Integer> curr = maxHeap.poll();
            int counter = curr.getValue();
            
            while(counter>0){
                result.append(curr.getKey());
                counter--;
            }
        }
        
        return result.toString();
    }

}

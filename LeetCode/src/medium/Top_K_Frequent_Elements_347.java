package medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Top_K_Frequent_Elements_347 {
	/*
	 * Input: nums = [1,1,1,2,2,3], k = 2 
	 * 	Output: [1,2]
	 */

	public static void main(String[] args) {

	}
	
	
	public int[] topKFrequent(int[] nums, int k) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer> ();
        
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            (e1, e2) -> e2.getValue() - e1.getValue());
        
        maxHeap.addAll(map.entrySet());
        
        
        int[] result = new int[k];
        int counter =0;
        while(counter<k){
            Map.Entry<Integer, Integer> curr= maxHeap.poll();
            result[counter++] = curr.getKey();
        }
        
        return result;
	}
	
	public static int[] topKFrequent1(int[] nums, int k) {
Map<Integer, Integer> map = new HashMap<Integer, Integer> ();
        
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        
        List<Integer> result = map.entrySet().stream()
        		.sorted((c1,c2) -> c2.getValue().compareTo(c1.getValue())).limit(k).map(x->x.getKey()).collect(Collectors.toList());
        
		int[] output = new int[k];
		
		for(int i = 0; i < result.size(); i++) {
	           output[i] = result.get(i);
	     }
        
		return output;
	}

}

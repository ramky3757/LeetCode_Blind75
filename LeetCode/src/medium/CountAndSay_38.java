package medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountAndSay_38 {

	public static void main(String[] args) {
		
		/*
		 * Input: n = 4 Output: "1211" Explanation: countAndSay(1) = "1" countAndSay(2)
		 * = say "1" = one 1 = "11" countAndSay(3) = say "11" = two 1's = "21"
		 * countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
		 */
		
		CountAndSay_38  c= new CountAndSay_38();
		System.out.println("----> "+c.countAndSay(4));;

	}
	
	public String countAndSay(int n) {
        if(n==1){
            return String.valueOf(1);
        }
        Map<Integer, String> map = new HashMap<Integer, String> ();
        map.put(0, String.valueOf(1));
        int counter=1;
        while(counter <= n){
            String s = map.get(counter-1);
            map.put(counter, buildString(s));
            counter++;
        }
        
        map.entrySet().stream().forEach(System.out::println);
        
        return map.get(n);
    }
    
    private String buildString(String input){
        
        String str = input;
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer> ();
        for(char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        StringBuffer sb = new StringBuffer();
        for(Entry<Character, Integer> entry: map.entrySet()){
            sb.append(map.get(entry.getKey())).append(entry.getKey());
        }
        
        return sb.toString();
    }

}

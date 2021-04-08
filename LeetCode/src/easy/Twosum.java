package easy;

import java.util.Arrays;
import java.util.HashMap;


/*
 * Input: nums = [2,7,11,15], target = 9
 *		Output: [0,1]
 *		Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 */
public class Twosum {

	public static void main(String[] args) {
	
		int[] nums = {2,7,11,15};
		System.out.println(Arrays.toString(twoSum(nums, 9)));
	}
	
	public static int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer> ();
		
		for(int i=0; i<nums.length; i++) {
			
			int compliment = target - nums[i];
			
			if(sumMap.containsKey(compliment)) {
				return new int[] {sumMap.get(compliment), i};
			}
			
			sumMap.put(nums[i], i);
			
		}
		
		return nums;
	}

}

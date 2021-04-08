package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums));

	}
	
	
public static boolean containsDuplicate(int[] nums) {
        
        Set<Integer> numSet = new HashSet<Integer>();
        
        for(int i=0; i<nums.length; i++){
            
            if(numSet.contains(nums[i])){
                return true;
            } else {
                numSet.add(nums[i]);
            }
        }
        
        return false;
        
    }

}

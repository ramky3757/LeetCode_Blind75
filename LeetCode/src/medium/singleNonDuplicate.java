package medium;

/*
 * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. 
 * Find this single element that appears only once.
 * Follow up: Your solution should run in O(log n) time and O(1) space.
 * 
 *  Input: nums = [1,1,2,3,3,4,4,8,8]
 *	Output: 2
 */


public class singleNonDuplicate {

	
	
	public static void main(String[] args) {
		
		int[] nums = {3,3,7,7,10,11,11};
		System.out.println(duplicate(nums));;
	}
	
	public static int duplicate(int[] nums) {
		
		int left=0, right=nums.length-1;
		
		while(left<=right) {
			
			int mid = left+(right-left)/2;
			
			if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) {
				return nums[mid];
			}
			
			
			if(mid%2==0) {
				
				if(nums[mid] == nums[mid-1]) {
					right = mid-2;
				} else {
					left = mid+2;					
				}
			} else {
				
				if(nums[mid] == nums[mid-1]) {
					left = mid+1;
				} else {
					right = mid-1;
				}
			}
			
		}
		return -1;
		
	}

}

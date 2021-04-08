package easy;

public class Missing_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {9,6,4,2,3,5,7,0,1};		
		System.out.println(missingNumber(nums));
		
	}

	public static int missingNumber(int[] nums) {
		
        int total_sum = nums.length*(nums.length+1)/2;
        int sum = 0;
        
        for(int i=0; i<nums.length; i++){           
            sum+= nums[i];                
        }
        
        return total_sum-sum;
        
    }
	
	
}

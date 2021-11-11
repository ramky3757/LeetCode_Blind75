package easy;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));

	}
	
	
	 public static int maxSubArray(int[] nums) {
	        
	        if(nums.length == 1){
	            
	            return nums[0];
	        }
	        
	        if(nums.length <=1){
	            return 0;
	        }
	        
	        int max =0;
	        int finalMax = 0;
	        int negative_chk = Integer.MIN_VALUE;
	        
	        for(int i=0; i<nums.length; i++){
	            max = max+nums[i] ;
	            
	            if(nums[i] > max){
	                max = nums[i];
	            }
	            
	            if(finalMax < max){
	                finalMax = max;
	            }
	            
	             if(nums[i] <= 0 && nums[i] > negative_chk){
	                negative_chk = nums[i];
	            }
	            
	        }
	        
	        if(finalMax<=0 && nums.length > 1){
	            finalMax = negative_chk;
	        }
	        
	        return finalMax;
	        
	    }

}

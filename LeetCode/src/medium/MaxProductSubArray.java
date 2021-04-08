package medium;

public class MaxProductSubArray {

	public static void main(String[] args) {
		
		int[] nums  = {2,3,-2,4};
		MaxProductSubArray mp= new MaxProductSubArray();
		
		System.out.println(mp.maxProduct(nums));

	}
	
	
	public int maxProduct(int[] nums) {
		
		int max =Integer.MIN_VALUE;
		int currentProduct = 1;
		
		for(int i=0; i<nums.length; i++) {
			
			currentProduct = currentProduct*nums[i];
			max = Math.max(currentProduct, max);
			currentProduct= currentProduct==0?1:currentProduct;
			
		}
		
		currentProduct = 1;
		
		for(int j=nums.length-1; j>=0; j--) {
			
			currentProduct*=nums[j];
			max = Math.max(currentProduct, max);
			currentProduct=currentProduct==0?1:currentProduct;
		}
		
		return max;
	}

}

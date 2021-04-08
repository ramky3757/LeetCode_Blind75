package medium;

public class FindMinRotatedSortedArray {

	public static void main(String[] args) {
		
		int[] nums = {3,4,5,1,2};
		FindMinRotatedSortedArray m = new FindMinRotatedSortedArray();
		System.out.println(m.findMin(nums));

	}
	
	public int findMin(int[] nums) {
		
		if(nums.length == 1) {
			return nums[0];
		}
		
		int l=0, r=nums.length-1;
		
		if(nums[r] > nums[l]) {
			return nums[l];
		}
		
		while(l<=r) {
			
			int mid = l+(r-l)/2;
			
			if(nums[mid] > nums[mid+1]) {
				return nums[mid+1];
			}
			
			if(nums[mid-1] > nums[mid]) {
				return nums[mid];
			}
			
			if(nums[0] < nums[mid]){
				l = mid+1;				
			} else {
				r = mid-1;
			}
			
		}
		return -1;
		
		
	}
	
	

}

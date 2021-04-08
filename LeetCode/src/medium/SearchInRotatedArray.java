package medium;

public class SearchInRotatedArray {

	public static void main(String[] args) {
	
		int[] nums = {4,5,6,7,0,1,2};
		int  target = 0;
		
		SearchInRotatedArray s = new SearchInRotatedArray();
		System.out.println(s.searchTarget(nums, 7));

	}
	
	
	public int searchTarget(int[] nums, int target) {
		
		if(nums.length==0) {
			return -1;
		}
		
		int l=0,r=nums.length-1;
		
		while(l<=r) {
			
			int mid = l+(r-l)/2;
			
			if(nums[mid] == target) {
				return mid;
			}
			
			if(nums[l] < nums[mid]) {
				
				if(target < nums[mid] && nums[l]<=target) {
					r = mid-1;
				}else 
					l = mid+1;
				
			} else {
				
				if(target > nums[mid] && nums[r] >= target) {
					l = mid+1;
				} else
					r = mid-1;
			}
			
		}
		
		
		return -1;
		
	}

}

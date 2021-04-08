package hard;

/*
 *  		nums1 = [1,2], nums2 = [3,4] 
 * 			Output: 2.50000
 *			Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 *
 *			Input: nums1 = [1,3], nums2 = [2]
 *			Output: 2.00000
 *			Explanation: merged array = [1,2,3] and median is 2.
 *
 */


public class MedianOfSortedArrays {

	public static void main(String[] args) {
		
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		
		System.out.println(findMedianSortedArrays(nums1, nums2));

	}
	
	
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        
	        if(nums1.length<1 && nums2.length <1){
	            return (double) -1;
	        }
	        
	               
	        int[] num3 = new int[nums1.length+nums2.length];
	        
	        int i=0, j=0, index=0;
	        
	        while(i<nums1.length && j<nums2.length){
	            
	            if(nums1[i] < nums2[j]){
	                num3[index++] = nums1[i++];
	            } else {
	                num3[index++] = nums2[j++];
	            }
	        }
	        
	        while(i<nums1.length){
	            num3[index++] = nums1[i++];
	        }
	        
	        while(j<nums2.length){
	            num3[index++] = nums2[j++];
	        }
	        
	        if(num3.length%2!=0){
	            return (double) num3[num3.length/2];
	        } else{
	            return (double) (num3[num3.length/2 -1] + num3[num3.length/2])/2;
	        }
	        
	        
	    }

}

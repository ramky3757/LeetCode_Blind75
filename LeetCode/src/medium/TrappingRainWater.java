package medium;

public class TrappingRainWater {
	
	
	////0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1
	
	
	
	
	private int trappingRainWater(int[] arr) {
		
		int result = 0;
		
		int left = 0, right = arr.length-1;
		int l_max = 0, r_max = 0;
		
		while(left<=right) {
			
			if(arr[left] < arr[right]) {
				
				if(arr[left]> l_max) {
					
					
					l_max = arr[left];
					
					
				} else {
					result+= l_max - arr[left];					
				}
				
				left ++;
			} else {
				
				if(arr[right] > r_max) {
					
					r_max = arr[right];
				} else {
					
					result = r_max - arr[right];
					
				}
				
				right --;
			}
			
			
			
		}
		
		return result;
	}

}

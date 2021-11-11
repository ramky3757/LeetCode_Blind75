package medium;

public class ContainsMostWater {
	
	public static void main(String[] args) {
		
		ContainsMostWater c = new ContainsMostWater();
		int[] height = {1,8,6,2,5,4,8,3,7};
		
		System.out.println(c.maxArea(height));
		c.areas(height);
		c.area(height);
	}
	
	
	//O(n2) solution
	public void area(int[] height) {
		int maxArea = 0;
		for(int i= 0; i<height.length; i++) {
		
			for(int j = i+1; j<height.length; j++) {
				
				int min = Math.min(height[i], height[j]);
				maxArea = Math.max(maxArea, min* j-i); 
				
			}
			
		}
		
		System.out.println(maxArea);
	}
	
	//O(logn) solution
	public void areas(int[] height) {
		
		int maxArea = 0;
		int l = 0, r = height.length -1;
		
		while(l<r) {
			
			int min = Math.min(height[l], height[r]);
			maxArea = Math.max(maxArea, min * r - l);
			
			if(height[l] < height[r]) {
				l++;
			} else
				r --;
			
		}
		
		System.out.println(maxArea);
		
	}
	
	
	public int maxArea(int[] height) {
	    
        int left =0, right=height.length-1;
        int curArea=0, maxArea =0;
        
        while(left<right){
         
            if(height[left] <height[right]){
                
                curArea = (right-left) * height[left];
                left++;
                
            } else{
                
                curArea = (right-left) * height[right];
                right--;
            }
            
            maxArea = Math.max(maxArea, curArea);
        }
        
        return maxArea;
    }

}




package medium;

public class ContainsMostWater {
	
	public static void main(String[] args) {
		
		ContainsMostWater c = new ContainsMostWater();
		int[] height = {1,8,6,2,5,4,8,3,7};
		
		System.out.println(c.maxArea(height));
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




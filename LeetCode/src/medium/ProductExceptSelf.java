package medium;

import java.util.Arrays;

public class ProductExceptSelf {

	public static void main(String[] args) {
		
		int[] nums = {-1,1,0,-3,3};
		
		ProductExceptSelf p = new ProductExceptSelf();
		//System.out.println(Arrays.toString(p.productExceptSelf(nums)));;
		//System.out.println(Arrays.toString(p.optimalProductExceptSelft(nums)));;
		p.productSelf(nums);

	}
	
	
	
	public int[] productSelf(int[] nums) {
		int[] product = new int[nums.length];
		int isZero =0;
		
		//if the zero's are more than 1 then the resulting array will be empty
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == 0) {
				isZero++;				
			}
			
		}
		
		
		if(isZero<2) {
			product[0] = 1;
			int curNum=1;
			for(int i=1; i<nums.length; i++) {	
			
				product[i] = nums[i-1]*product[i-1];				
			}
			
			for(int j=nums.length-2; j>-1;j--) {	
				curNum *= nums[j+1];
				product[j] = product[j] * curNum;				
			}
			
			System.out.println(Arrays.toString(product));			
		} else {
			System.out.println(Arrays.toString(product));
		}
		
		
		
		
		return product;
	}
	
	
	
	 public int[] productExceptSelf(int[] nums) {
	        
	        int[] answer = new int[nums.length];
	        
	        for(int i=0; i <nums.length; i++){            
	            answer[i] = sum(nums,i);            
	        }
	        
	        return answer;
	        
	    }
	    
	    public int sum(int[] nums, int i){
	        
	        int sum = 1;
	        
	        for(int j=0; j<nums.length; j++){
	            
	            if(i != j){
	                sum=sum*nums[j];
	            }            
	        }        
	        return sum;
	    }
	    
	    
	  //optimal version	    
	    public int[] optimalProductExceptSelft(int[] arr) {
	    	int product = 1;
			int prod[] = new int[arr.length];
			
	       int zerocounter=0;

			
			for (int i = 0; i < arr.length; i++)
			{
				if (arr[i] == 0) 
				{
					
	                zerocounter++;
					continue;
				}
				product = product * arr[i];
			}

			if (product != 0) {
				if (zerocounter==1)
				{
					for (int i = 0; i < arr.length; i++) {
						if (arr[i] != 0)
							prod[i] = 0;
						else
							prod[i] = product;
					}
				} 
	            else if (zerocounter>1)
	            {
	                for (int i = 0; i < arr.length; i++)
					    prod[i] = 0;
	            }
				else 
				{
					for (int i = 0; i < arr.length; i++)
						prod[i] = product / arr[i];
				}
			} 
			else 
			{
				for (int i = 0; i < arr.length; i++)
					prod[i] = 0;
			}

			return prod;
		
		    }
	    
	    

}

package easy;


/*
 *    Input: x = 121
 *		Output: true
 *
 *			Input: x = -121
 *				Output: false 
 * 
 */


public class PalindromeNumber {

	public static void main(String[] args) {		
		System.out.println(isPalindrome(121));
		
		System.out.println(isPalin(-121));
	}
	
	
	//Approach 1	
	 public static boolean isPalindrome(int x) {
	        
	        if(x<0){
	            return false;
	        }
	       
	        return x == reverse(x);
	    }
	    
	    public static int reverse(int n) {
	        int res = 0;
	        while(n != 0) {
	            res = res*10 + n%10;
	            n /= 10;
	        }
	        
	        System.out.println(res);
	        return res;
	    }
	    
	    //Approach 2 - using String API
	    public static boolean isPalin(int x) {
	    	
	    	if(x<0) {
	    		return false;
	    	}
	    	
	    	String s = Integer.toString(x);
	    	String reverse = new StringBuffer().append(x).reverse().toString();
	    	
	    	return s.equals(reverse);
	    }
	    

}

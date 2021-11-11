package medium;

public class ReverseString_151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Input: s = "  hello world  "
				Output: "world hello"
				Explanation: Your reversed string should not contain leading or trailing spaces.
				
				*/

	}
	
	public String reverseString(String s) {
		
		int i=0;
        int length=s.length();   
        int j=0;
        String res=null;
        String sub=null;
        while(i<length)
        {
            //inoring spaces
            while(i<length && s.charAt(i)==' ') i++;
            if(i==length) break;
            j=i+1;
            //recognizing word
            while(j<length && s.charAt(j)!=' ') j++;
            sub=s.substring(i,j);
            //we don't need to reverse the result string just concate the string in reverse order 
            res=res==null?sub:sub+" "+res;  
            
            i=j+1;
        }
        return res;
		
	}

}

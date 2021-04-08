package easy;

public class ReverseInteger {

	public static void main(String[] args) {
		// 
		
		int x = -123;
		System.out.println(reverse(x));
	}

public static int reverse(int x) {
        
        String reversedString = new StringBuffer().append(Math.abs(x)).reverse().toString();
        try{        
        		return (x<0)? Integer.parseInt(reversedString)*-1:Integer.parseInt(reversedString);
        
            } catch(Exception e){
            return 0;
        }
    }
	
}

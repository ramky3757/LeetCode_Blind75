package medium;

public class MultiplyStrings {

	public static void main(String[] args) {
		
		String s1 = "123";
		String s2 = "32";
		
		MultiplyStrings ms = new MultiplyStrings();
		System.out.println(ms.multiply(s1, s2));

	}
	
	
	public String multiply(String num1, String num2) {
		
        if(num1.equals("0") || num2.equals("0")) return "0";
        
        int N1 = num1.length(), N2 = num2.length();
        int[] sums = new int[N1+N2];
        
        for(int i = N1-1; i > -1; i--){
            for(int j = N2-1; j > -1; j--){
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
                sums[i+j+1] = sums[i+j+1] + product;
                sums[i+j] += sums[i+j+1]/10;
                sums[i+j+1] = sums[i+j+1]%10;
            }
        }
        
        int i = 0;
        while(sums[i] == 0) i++;
        StringBuilder result = new StringBuilder();
        while(i < N1+N2){
            result.append(sums[i++]);
        }
        
        return result.toString();
    }

}

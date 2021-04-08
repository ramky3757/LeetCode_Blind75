package easy;

public class BestTimeToBuySellStock {

	public static void main(String[] args) {
		
		int[] prices = {7,4,5,1,6,4};
		int minBuy = prices[0];
		int maxProfit = 0;
		
		for(int i=1; i<prices.length; i++) {
			
			if(prices[i] < minBuy) {
				minBuy = prices[i];
			} else if(prices[i] - minBuy > maxProfit) {
				maxProfit = prices[i] - minBuy;
			}
			
		}
		
		System.out.println(maxProfit);

	}

}

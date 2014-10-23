package leetcode;

public class Stock {
	 public static int maxProfit(int[] prices) {
		 int buyPrice = 0;
		 int sellPrice = 0;
		 int result = 0;
		 boolean stock = false; 
	        for(int i = 0;i<prices.length;i++){
	        	if( i+1 == prices.length) {
	        		if(stock)return result + prices[prices.length-1] - buyPrice;
	        		else return result;
	        	}
	        	if(prices[i] < prices[i+1] & !stock){
	        		buyPrice = prices[i];
	        		stock = true;
	        	}
	        	else if(prices[i] > prices[i+1] & stock){
	        		sellPrice = prices[i];
	        		stock = false;
	        		result = result + sellPrice - buyPrice;
	        	}
	       
	        }
	        return result;
	    }
	 public static void main(String[] args){
		 int[] prices = new int[4];
		 prices[0] = 1;
		 prices[1] = 2;
		 prices[2] = 3;
		 prices[3] = 4;
		 System.out.println(maxProfit(prices));
	 }
	 
}

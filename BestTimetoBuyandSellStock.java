package leetcode;

public class BestTimetoBuyandSellStock {
	public static int maxProfit(int[] prices) {
		 if(prices.length == 0) return 0;
		 int[] buyPrice = new int[prices.length-1];
		 int[] sellPrice = new int[prices.length-1];
		 int m = 0;
		 int n = 0;
		 boolean stock = false; 
	        for(int i = 0;i<prices.length;i++){
	        	if( i+1 == prices.length) {
	        		if(stock){
	        			sellPrice[n] = prices[i];
	        			n++;
	        		}
	        		break;
	        	}
	        	if(prices[i] < prices[i+1] & !stock){
	        		buyPrice[m] = prices[i];
	        		m++;
	        		stock = true;
	        	}
	        	else if(prices[i] > prices[i+1] & stock){
	        		sellPrice[n] = prices[i];
	        		n++;
	        		stock = false;
	        	}	       
	        }      
	        if(m == 0) return 0;
	        int result = Integer.MIN_VALUE;
	        for(int i = 0;i<m;i++){
	        	int max = Integer.MIN_VALUE;
	        	for(int j = i;j<n;j++){
	        		max = Math.max(sellPrice[j], max);
	        	}
	        	result = Math.max(result, max-buyPrice[i]);        	
	        }
	        return result;
	}
	public static void main(String[] args){
		 int[] prices = {2,1,3,2,5};
		 System.out.println(maxProfit(prices));
	 }
}

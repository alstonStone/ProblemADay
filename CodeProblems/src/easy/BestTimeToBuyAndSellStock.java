package easy;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {


        int lowestPrice = prices[0];
        int current = 0;
        int highestValue = 0;


        for(int i = 0 ; i < prices.length; i++){

            if(prices[i] < lowestPrice){
                lowestPrice = prices[i];
            }
            current = prices[i] - lowestPrice;
            if(current > highestValue){
                highestValue = current;
            }
        }
        return highestValue;

    }
}
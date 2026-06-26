
public class Solution1 {
    public static int maxProfit(int[] prices) {
        int bestBuy = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length - 1; i++){
            if(prices[i] < bestBuy){
                bestBuy = prices[i];
            }
            if(bestBuy < prices[i] && prices[i] > prices[i + 1]){
                profit += prices[i] - bestBuy;
                bestBuy = prices[i];
            }
        }
        if(prices[prices.length - 1] > bestBuy){
            profit += prices[prices.length - 1] - bestBuy;
        }
        return profit;
    }

    public static int maxProfitWorking(int[] prices) {
        int bestBuy = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++) {

            if(prices[i] < bestBuy) {
                bestBuy = prices[i];
            }

            if(i == prices.length - 1 || prices[i] > prices[i + 1]) {
                if(prices[i] > bestBuy) {
                    profit += prices[i] - bestBuy;
                    bestBuy = prices[i];
                }
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int profit = maxProfitWorking(prices);
        System.out.println(profit);
    }
}

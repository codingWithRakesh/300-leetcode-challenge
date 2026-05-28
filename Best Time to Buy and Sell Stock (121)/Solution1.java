public class Solution1 {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bestBuy = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < bestBuy){
                bestBuy = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}

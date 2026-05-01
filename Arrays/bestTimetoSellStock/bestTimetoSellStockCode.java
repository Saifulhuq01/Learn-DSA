package Arrays.bestTimetoSellStock;

public class bestTimetoSellStockCode {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        // maxProfit(prices);
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices){

        int buy = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            
            int profit = prices[i] - buy;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (prices[i] < buy) {
                buy = prices[i];
            }
        }

        return maxProfit;
    }

}

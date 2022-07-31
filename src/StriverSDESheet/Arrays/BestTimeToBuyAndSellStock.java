// Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

package StriverSDESheet.Arrays;

public class BestTimeToBuyAndSellStock {

    // Using Kadane's Algorithm
    // Time Complexity: O(n), Auxiliary Space: O(1) where n = arr.length
    static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyDay = 0;

        for (int sellDay = 1; sellDay < prices.length; sellDay++) {
            int profit = prices[sellDay] - prices[buyDay];
            maxProfit = Integer.max(maxProfit, profit);
            if (profit < 0) {
                buyDay = sellDay;
            }
        }

        return maxProfit;
    }
    
    public static void main(String[] args) {
        
    }
}

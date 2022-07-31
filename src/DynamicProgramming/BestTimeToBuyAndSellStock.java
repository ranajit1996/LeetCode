// Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

package DynamicProgramming;

public class BestTimeToBuyAndSellStock {

    // Kadane's Algorithm
    static int bestTimeToBuyAndSellStock(int[] prices) {
        int maxProfit = 0;
        int startIndex = 0;

        for (int day = 1; day < prices.length; day++) {
            int profit = prices[day] - prices[startIndex];
            if (profit < 0) {
                startIndex = day;
            }
            maxProfit = Integer.max(maxProfit, profit);
        }

        return maxProfit;
    }

    // TODO: Dynamic Programming Approach

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        // int[] prices = { 7, 6, 4, 3, 1 };
        System.out.println(bestTimeToBuyAndSellStock(prices));
    }
}

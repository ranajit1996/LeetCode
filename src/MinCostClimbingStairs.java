// Problem Link: https://leetcode.com/problems/min-cost-climbing-stairs/

public class MinCostClimbingStairs {

    // Time Complexity: O(2^n), Space Complexity: O(n)
    static int minCostClimbingStairsRecursive(int[] cost, int n) {
        if (n == 0 || n == 1) {
            return 0;
        }

        return Integer.min(cost[n-1] + minCostClimbingStairsRecursive(cost, n-1), cost[n-2] + minCostClimbingStairsRecursive(cost, n-2));
    }

    // Time Complexity: O(n), Space Complexity: O(n)
    // Space complexity can be optimized to O(1)
    static int minCostClimbingStairsDP(int[] cost) {
        int n = cost.length;

        // Declare DP Array
        int[] dp = new int[n+1];

        // Base Condition
        dp[0] = 0;
        dp[1] = 0;

        // Find Solution
        for (int i = 2; i < n+1; i++) {
            dp[i] = Integer.min(cost[i-1] + dp[i-1], cost[i-2] + dp[i-2]);
        }

        // Return Result
        return dp[n];
    }
    
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        // int[] cost = {10,15, 20};
        System.out.println(minCostClimbingStairsRecursive(cost, cost.length));
        System.out.println(minCostClimbingStairsDP(cost));
    }
}

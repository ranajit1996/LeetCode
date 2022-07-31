// Problem Link: https://leetcode.com/problems/climbing-stairs/

package DynamicProgramming;

public class ClimbingStairs {

    static int climbStairsRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }

    static int climbStairsDP(int n) {
        // Declare DP Array
        int[] dp = new int[n + 1];

        // Base Condition
        dp[0] = dp[1] = 1;

        // Find Solution
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // Return Result
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(climbStairsRecursive(n));
        System.out.println(climbStairsDP(n));
    }
}

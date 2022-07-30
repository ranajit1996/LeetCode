// Problem Link: https://leetcode.com/problems/n-th-tribonacci-number/

package DynamicProgramming;

public class Tribonacci {

    // Time Complexity: O(3^n), Space Complexity: O(n)
    static int tribonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        return tribonacciRecursive(n-1) + tribonacciRecursive(n-2) + tribonacciRecursive(n-3);
    }

    // Time Complexity: O(n), Space Complexity: O(n)
    // Space complexity can be optimized to O(1)
    static int tribonacciDP(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        
        // Declare DP Array
        int[] dp = new int[n+1];

        // Base Condition
        dp[0] = 0;
        dp[1] = dp[2] = 1;

        // Find Solution
        for (int i = 3; i < n+1; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        // Return Result
        return dp[n];
    }

    // TODO: Find Recurrence Realtion of Tribonacci to solve it in O(1) time and space complexity
    

    public static void main(String[] args) {
        int n = 25;
        System.out.println(tribonacciRecursive(n));
        System.out.println(tribonacciDP(n));
    }
}

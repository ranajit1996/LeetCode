// Problem Link: https://leetcode.com/problems/counting-bits/

// Explanation: https://leetcode.com/problems/counting-bits/discuss/1808016/C%2B%2B-oror-Vectors-Only-oror-Easy-To-Understand-oror-Full-Explanation

package DynamicProgramming;

import java.util.Arrays;

public class CountingBits {

    // Time Complexity: O(log(n)), Space Complexity: O(log(n))
    // Using this if we calculate all n elements then, Time Complexity: O(n log(n)), Space Complexity: O(n)
    static int countingBitsRecursive(int n) {
        if (n == 0) {
            return n;
        }

        return countingBitsRecursive(n / 2) + n % 2;
    }

    // Time Complexity: O(n), Space Complexity: O(n)
    static int[] countingBitsDP(int n) {
        // Initialize DP Array
        int[] dp = new int[n + 1];

        // Base Condition
        dp[0] = 0;

        // Find Solution
        for (int i = 1; i < n + 1; i++) {
            dp[i] = dp[i / 2] + i % 2;
        }

        // Return Result
        return dp;
    }

    public static void main(String[] args) {
        int n = 32;
        System.out.println(Arrays.toString(countingBitsDP(n)));
    }
}

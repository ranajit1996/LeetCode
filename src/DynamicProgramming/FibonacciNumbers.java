package DynamicProgramming;
// Problem Link: https://leetcode.com/problems/fibonacci-number/

// Explanation (Using Recurrence Relation): https://sites.math.northwestern.edu/~mlerma/problem_solving/results/recurrences.pdf

public class FibonacciNumbers {

    // Time Complexity: O(2^n), Space Complexity: O(n)
    static int nthFibRecursive(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return nthFibRecursive(n - 1) + nthFibRecursive(n - 2);
    }

    // Time Complexity: O(n), Space Complexity: O(n)
    static int nthFibDP(int n) {
        // Declare DP Array
        int[] dp = new int[n + 1];

        // Base Condition
        dp[0] = 0;
        dp[1] = 1;

        // Find Solution
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // Return result
        return dp[n];
    }

    // Time Complexity: O(1), Space Complexity: O(1)
    static int nthFibRecurrenceRelation(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        double r1 = (1 + Math.sqrt(5)) / 2;
        double r2 = (1 - Math.sqrt(5)) / 2;
        return (int) ((1 / Math.sqrt(5)) * (Math.pow(r1, n) - Math.pow(r2, n)));
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(nthFibRecursive(n));
        System.out.println(nthFibDP(n));
        System.out.println(nthFibRecurrenceRelation(n));
    }
}

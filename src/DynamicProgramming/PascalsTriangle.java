package DynamicProgramming;
// Problem Link: https://leetcode.com/problems/pascals-triangle/

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    // Time Complexity: O(n^2), Auxiliary Space: O(n)
    static List<List<Integer>> pascalsTriangleDP(int n) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        resultList.add(result);

        // Declare DP Array
        int[] dp = new int[n+1];

        // Base Condition
        dp[1] = 1;

        // Find Solution
        int[] temp = new int[n+1];
        for (int i = 2; i < n+1; i++) {
            result = new ArrayList<>();

            for (int j = 1; j < i+1; j++) {
                temp[j] = dp[j] + dp[j-1];
                result.add(temp[j]);
            }

            // Copy Back to DP Array
            for (int j = 0; j < n+1; j++) {
                dp[j] = temp[j];
                temp[j] = 0;
            }

            // Add Result to Result List
            resultList.add(result);
        }

        // Return Result
        return resultList;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(pascalsTriangleDP(n));
    }
}

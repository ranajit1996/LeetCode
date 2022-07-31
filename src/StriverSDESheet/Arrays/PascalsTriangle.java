// Problem Link: https://leetcode.com/problems/pascals-triangle/

package StriverSDESheet.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    
    // Time Complexity: O(n^2), Auxiliary Space: O(n)
    static List<List<Integer>> pascalsTriangle(int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        // Declare DP Array
        int[] dp = new int[n];

        // Base Condition
        dp[0] = 1;

        // Find Solution
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                dp[j] = dp[j] + dp[j-1];
            }

            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                temp.add(dp[j]);
            }

            result.add(temp);
        }

        // Return Result
        return result;
    }

    public static void main(String[] args) {
        
    }
}

// Problem Link: https://leetcode.com/problems/pascals-triangle-ii/

package DynamicProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PascalsTriangleII {

    // Time Complexity: O(n), Space Complexity: O(n)
    static List<Integer> pascalsTriangleII(int rowIndex) {
        // Declare DP Array
        int[] dp = new int[rowIndex + 1];

        // Base Condition
        dp[0] = 1;

        // Find Solution
        for (int i = 0; i < rowIndex + 1; i++) {
            for (int j = i; j > 0; j--) {
                dp[j] = dp[j] + dp[j-1];
            }
        }

        // Return Result
        return IntStream.of(dp).boxed().collect(Collectors.toList());
    }
    
    public static void main(String[] args) {
        int rowIndex = 4;
        System.out.println(pascalsTriangleII(rowIndex));
    }
}

// Problem Link: https://leetcode.com/problems/is-subsequence/

package DynamicProgramming;

public class IsSubsequence {

    // Time Complexity: O(n), Space Complexity: O(n) where m = s.length() and n = t.length()
    static boolean isSubsequenceRecursive (String s, String t, int sIndex, int tIndex) {
        if (sIndex == 0) {
            return true;
        }
        if (tIndex == 0) {
            return false;
        }

        if (s.charAt(sIndex-1) == t.charAt(tIndex-1)) {
            return isSubsequenceRecursive(s, t, sIndex-1, tIndex-1);
        }

        return isSubsequenceRecursive(s, t, sIndex, tIndex-1);
    }
    
    // Time Complexity: O(m*n), Space Complexity: O(m*n) where m = s.length() and n = t.length()
    static boolean isSubsequenceDP(String s, String t) {
        // Declare DP Array
        boolean[][] dp = new boolean[s.length()+1][t.length()+1];

        // Base Condition
        for (int tIndex = 0; tIndex < t.length()+1; tIndex++) {
            dp[0][tIndex] = true;
        }

        // Find Solution
        for (int sIndex = 1; sIndex < s.length()+1; sIndex++) {
            for (int tIndex = 1; tIndex < t.length()+1; tIndex++) {
                if (s.charAt(sIndex-1) == t.charAt(tIndex-1)) {
                    dp[sIndex][tIndex] = dp[sIndex-1][tIndex-1];
                }
                else {
                    dp[sIndex][tIndex] = dp[sIndex][tIndex-1];
                }
            }
        }

        // Return Result
        return dp[s.length()][t.length()];
    }
    

    // Time Complexity: O(n), Space Complexity: O(1) where m = s.length() and n = t.length()
    static boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        for (int tIndex = 0; tIndex < t.length() && sIndex < s.length(); tIndex++) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
        }

        if (sIndex == s.length()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "adbef";
        System.out.println(isSubsequenceRecursive(s, t, s.length(), t.length()));
        System.out.println(isSubsequenceDP(s, t));
        System.out.println(isSubsequence(s, t));
    }
}

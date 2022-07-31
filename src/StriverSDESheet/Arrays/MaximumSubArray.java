// Problem Link: https://leetcode.com/problems/maximum-subarray/

package StriverSDESheet.Arrays;

public class MaximumSubArray {

    // Kadane's Algorithm
    // Time Complexity: O(n), Auxiliary Space: O(1) where n = arr.length
    static int maximumSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxSum = Integer.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }
    
    public static void main(String[] args) {
        
    }
}

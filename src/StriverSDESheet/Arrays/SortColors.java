// Problem Link: https://leetcode.com/problems/sort-colors/

package StriverSDESheet.Arrays;

public class SortColors {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    // Dutch Partitioning Algorithm
    // Time Complexity: O(n), Auxiliary Space: O(1) where n = arr.length
    static void sortColors(int[] arr) {
        int low = -1, high = arr.length;
        int i = 0;
        while (i < high) {
            if (arr[i] == 0) {
                low++;
                swap(arr, i, low);
                i++;
            }
            else if (arr[i] == 2) {
                high -= 1;
                swap(arr, i, high);
            }
            else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        
    }
}

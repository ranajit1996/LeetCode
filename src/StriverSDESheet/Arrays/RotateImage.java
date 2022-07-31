// Problem Link: https://leetcode.com/problems/rotate-image/

package StriverSDESheet.Arrays;

public class RotateImage {

    static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void reverseRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1] = temp;
            }
        }
    }

    static void rotate(int[][] matrix) {
        transpose(matrix);
        reverseRows(matrix);
    }
    
    public static void main(String[] args) {
        
    }
}

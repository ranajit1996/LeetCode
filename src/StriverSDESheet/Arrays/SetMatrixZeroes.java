// Problem Link: https://leetcode.com/problems/set-matrix-zeroes/

package StriverSDESheet.Arrays;

import java.util.Arrays;

public class SetMatrixZeroes {

    // Time Complexity: O(n * m), Auxiliary Space: O(n + m) where n = number of rows
    // and m = number of columns
    void setMatrixZeros(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // Auxiliary Space to sotre if i'th row contains zero or j'th column contains
        // zero
        int[] row = new int[m];
        int[] col = new int[n];

        // Prefill Auxiliary Rows and Colums with Ones
        Arrays.fill(row, 1);
        Arrays.fill(col, 1);

        // Traverse whole matrix and check if the corresponding row and column will
        // contain zero or not
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    row[j] = col[i] = 0;
                }
            }
        }

        // Traverse whole matrix and set mat[i][j] to zero if corresponding row or
        // column will contains zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[j] == 0 || col[i] == 0) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    // Time Complexity: O(n * m), Auxiliary Space: O(1) where n = number of rows and
    // m = number of columns
    // IDEA: Here the idea is to utilize matrix's first row and first column as
    // Auxiliary Space. Hence Auxiliary Space Complexity will become O(1)
    void setMatrixZerosSpaceOptimized(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // As we are not using any auxiliary row or columns so we need to store if first
        // row or column contains zero or not seperately
        boolean doesFirstRowContainsZero = false;
        boolean doesFirstColContainsZero = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    // Check if first row contains zero
                    if (i == 0) {
                        doesFirstRowContainsZero = true;
                    }
                    // Check if first column contains zero
                    if (j == 0) {
                        doesFirstColContainsZero = true;
                    }
                    mat[0][j] = mat[i][0] = 0;
                }
            }
        }

        // Traverse matrix starting from second row and second column and set mat[i][j]
        // to zero if the corresponding row or column contains zero
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[0][j] == 0 || mat[i][0] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        // If first row contains zero then fill entire row with zeros
        for (int j = 0; j < m && doesFirstRowContainsZero; j++) {
            mat[0][j] = 0;
        }

        // If first column contains zero then fill entire column with zeros
        for (int i = 0; i < n && doesFirstColContainsZero; i++) {
            mat[i][0] = 0;
        }
    }

    public static void main(String[] args) {

    }
}

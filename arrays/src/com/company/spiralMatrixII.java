package com.company;

// Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix II.
// link: https://leetcode.com/problems/spiral-matrix-ii/
import java.util.Arrays;

public class spiralMatrixII {
    public static void main(String[] args) {
        int n = 2;
        int [][] ansf = generateMatrix(n);
//        System.out.println(Arrays.toString(Arrays.toString(ansf)));
        for (int[] row : ansf)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }

    public static int[][] generateMatrix(int n){
        int [][] ans = new int[n][n];
        int top = 0;
        int left = 0;
        int right = n-1;
        int bottom = n-1;
        int num = 1;
        while (left <= right && top <= bottom){
            for (int i = left; i <= right; i++) {
                ans[top][i] = num;
                num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans[i][right] = num;
                num++;
            }
            right--;
            if (!(left <= right && top <= bottom)){
                break;
            }
            for (int i = right; i >= left ; i--) {
                ans[bottom][i] = num;
                num++;
            }
            bottom --;
            for (int i = bottom; i >= top ; i--) {
                ans[i][left] = num;
                num++;
            }
            left++;
        }
        return ans;
    }
}

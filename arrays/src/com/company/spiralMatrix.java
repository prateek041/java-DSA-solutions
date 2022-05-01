package com.company;
// link: https://leetcode.com/problems/spiral-matrix/
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println((spiralOrder(matrix)));
    }

    // decrease "right" when we reach bottom, increase top when we reach right. bottom decreased when left reached,
    // increase left when reach top.

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        // we have four variables that point the space for array traversal.
        // TOP, LEFT, RIGHT, BOTTOM.
        // first go through the first row, then last column, then last row and eventually first column.
        // "increase" top when first row done, "decrease" right when last column done, "decrease" bottom when last row
        // done, "increase" left when first column done.
        // terminating condition, when left >= right or top >= bottom.
        int left = 0;
        int right = matrix[0].length;
        int top = 0;
        int bottom = matrix.length;
        while (top < bottom && left < right) {
            for (int i = left; i < right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i < bottom; i++) {
                list.add(matrix[i][right - 1]);
            }
            right--;
            if (!(left < right && top < bottom)) {
                break;
            }
            for (int i = right - 1; i >= left; i--) {
                list.add(matrix[bottom - 1][i]);
            }
            bottom--;
            for (int i = bottom - 1; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }
        return list;
    }
}

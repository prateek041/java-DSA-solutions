package com.company;

public class setMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        int elementCount = (matrix.length) * (matrix[0].length);
        while (elementCount != 0) {
            for (int row = 0; row < matrix.length; row++) {
                for (int column = 0; column < matrix[0].length; column++) {
                    if (matrix[row][column] == 0) {
                        System.out.printf("zero found at %d row and %d column \n", row, column);
                    }
                    elementCount--;
                }
            }
        }
    }
}

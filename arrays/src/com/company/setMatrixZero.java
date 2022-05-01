package com.company;
// link: https://leetcode.com/problems/set-matrix-zeroes/
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class setMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0}, {3,4,5,2}, {1,3,1,5}, {1,1,1,1}};
        setZeroes(matrix);
    }

    // my approach was somewhat correct, it needed some tweaking, will get back at it asap.
//    public static void setZeroes(int[][] matrix) {
//        int rows = matrix.length;
//        int columns = matrix[0].length;
//        int[][] newArray = matrix;
////        int elementCount = (matrix.length) * (matrix[0].length);
//        ArrayList<Integer> visitedRow = new ArrayList<>(rows - 1);
//        ArrayList<Integer> visitedCol = new ArrayList<>(columns - 1);
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[0].length; column++) {
//                if (matrix[row][column] == 0) { // found the 0th element, fill it with zero!
//                    if (visitedRow.contains(row) || visitedCol.contains(column)) {
//                        continue;
//                    } else {
//                        int rowCount = 0;
//                        int colCount = 0;
//                        while (rowCount < rows || colCount < columns) {
//                            newArray[row][rowCount] = 0; // this one is for specific row.
//                            newArray[colCount][column] = 0; // this one is for specific column.
//                            visitedCol.add(colCount);
//                            visitedRow.add(rowCount);
//                            rowCount++;
//                            colCount++;
//                        }
//                    }
//                }
//                newArray[row][column] = matrix[row][column];
//            }
//        }
//        for (int i = 0; i < newArray.length; i++) {
//            // Loop through all elements of current row
//            for (int j = 0; j < newArray[i].length; j++)
//                System.out.print(newArray[i][j] + " ");
//            System.out.print("\n");
//        }
//
//    }

    // Approach one ********
    public static void setZeroes(int [][] matrix){
        // make a pass over the original array and record the position of zeroes.
        int rows = matrix.length;
        int columns = matrix[0].length;
        ArrayList<Integer> rowCheck= new ArrayList<>(rows);
        ArrayList<Integer> colCheck= new ArrayList<>(columns);
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (matrix[row][column] == 0){
                    rowCheck.add(row);
                    colCheck.add(column);
                }
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (rowCheck.contains(row) || colCheck.contains(column)){
                    matrix[row][column] = 0;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            // Loop through all elements of current row
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }
    }

    // there is a better approach available, will check it out later. bookmarked !
}

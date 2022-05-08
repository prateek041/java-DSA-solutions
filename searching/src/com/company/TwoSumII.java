package com.company;
// Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/
// RUNTIME : 2 ms, faster than 66.46% of Java online submissions.
import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {-1, 0};
        int target = -1;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[]numbers, int target){
        int start = 0;
        int end = numbers.length-1;
        while (numbers[start] + numbers[end] != target){
            if(numbers[start] + numbers[end] > target){
                end --;
            }
            else{
                start ++;
            }
        }
        int[] solution = new int[2];
        solution[0] = start + 1;
        solution[1] = end + 1;
        return solution;
    }
}

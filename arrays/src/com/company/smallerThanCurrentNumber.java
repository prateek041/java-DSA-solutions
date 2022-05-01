package com.company;
// Runtime: 11 ms, faster than 70.93% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
// link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
import java.util.Arrays;

public class smallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int [] nums){
        int [] counts = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                    count++;
                }
                counts[i] = count;
            }
        }
        return counts;
    }
}

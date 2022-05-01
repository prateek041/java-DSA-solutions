package com.company;
// link: https://leetcode.com/problems/running-sum-of-1d-array/
import java.util.Arrays;

public class Sum1DArray {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[]nums){
        int[] ans = new int[nums.length];
        ans[0] = ans[0] + nums[0];
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i-1] + nums[i];
        }
        return ans;
    }
}

package com.company;
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Shuffle the Array.
// link: https://leetcode.com/problems/shuffle-the-array/
import java.util.Arrays;

public class shuffleArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n){
        // finding the start of the array and storing it in x.
        int x = 0;
        int end = nums.length;
        // finding the mid of the array and storing it into y.
        int y = x + (end-x)/2;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i%2!=0){
                ans[i] = nums[y];
                y++;
            }
            else{
                ans[i] = nums[x];
                x++;
            }
        }
        return ans;
    }
}

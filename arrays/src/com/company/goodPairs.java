package com.company;

//Runtime: 1 ms, faster than 84.91% of Java online submissions for Number of Good Pairs.
// link : https://leetcode.com/problems/number-of-good-pairs/

public class goodPairs {
    public static void main(String[] args) {
        int [] nums = {1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int [] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }

}

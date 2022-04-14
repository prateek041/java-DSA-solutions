package com.company;

// this one was not completed.

import java.util.Arrays;

public class targetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index){
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            if(target[i] == 0 ) {
                target[index[i]] = nums[i];
            }
        }
        return target;
    }
}

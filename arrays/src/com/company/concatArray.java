package com.company;
// link : https://leetcode.com/problems/concatenation-of-array/
import java.util.Arrays;

public class concatArray {
    public static void main(String[] args) {
        int [] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums){
        int[] ans = new int[(nums.length)*2];
        int index;
        int indexNums = 0;
        for (index = 0; index<ans.length; index++){
            if(index == nums.length){
                indexNums = 0;
            }
            ans[index] = nums[indexNums];
            indexNums++;
        }
        return ans;
    }
}

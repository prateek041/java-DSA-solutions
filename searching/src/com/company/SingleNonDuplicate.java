package com.company;
// Runtime : Runtime: 0 ms, faster than 100.00% of Java online submissions.
public class SingleNonDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-2; // second last index
        while (start <= end){
            int mid = start+(end-start)/2;
            if (nums[mid] == nums[mid^1]){ // if even, XOR will return odd number, 1 greater than it, if odd, XOR will
                                           // return number smaller and even than it. both conditions check left half,
                                           // shrink left half.
                start = mid+1;
            }
            else{ // It is right half, shrink it!!
                end = mid-1;
            }
        }
        return nums[start];
    }
}

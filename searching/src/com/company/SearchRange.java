package com.company;
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Find First and Last Position of Element in Sorted Array.
// question link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array.
import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int [] nums, int target){
        int firstAppearance = -1;
        int lastAppearance = -1;
        int[] position = new int[2];
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start+(end-start)/2;
            if (nums[start] == target){
                firstAppearance = start;
            }
            if (nums[end] == target){
                lastAppearance = end;
            }
            if(nums[mid] > target){
                end = mid-1;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else{
                if(firstAppearance == -1){
                    start++;
                }
                else if(lastAppearance == -1){
                    end--;
                }
                else{
                    break;
                }
            }
        }
        position[0] = firstAppearance;
        position[1] = lastAppearance;
        return position;
    }
}

package com.company;
// link: https://leetcode.com/problems/sqrtx/
public class squareRoot {

    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
    }

    // This is what I came up with, and it is very slow, runtime 99ms (Linear search).
//    public static int mySqrt(int x){
//        int divNumber = x/2 + 1;
//        for (int num = 1; num <= divNumber; num++) {
//            int sqrtMaybe = x / num;
//            if (sqrtMaybe <= num){
//                return sqrtMaybe;
//            }
//        }
//        return 0;
//    }

// solution using binary search
// Runtime: 2 ms, faster than 72.08% of Java online submissions for Sqrt(x)
// ideal condition is mid*mid = number.
    public static int mySqrt(int x) {
        int ans = 0;
        int start = 1;
        int end = start + (x - start) / 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) { // mid is greater than answer.
                end = mid - 1;
            }
            else{
                start = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}


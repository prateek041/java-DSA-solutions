package com.company;
// Runtime: Runtime: 0 ms, faster than 100.00% of Java online submissions
// link: https://leetcode.com/problems/valid-perfect-square/submissions/
// using long is the key takeaway !
public class IsPerfectSquare {
    public static void main(String[] args) {
        int num = 2147483647;
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;
        if (num == 1) {
            return false;
        } else {
            while (start <= end) {
                long mid = start + (end - start) / 2;
                if ((mid * mid) < num) {
                    start = mid + 1;
                } else if ((mid * mid) > num) {
                    end = mid - 1;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}

package com.company;
// leetcode link: https://leetcode.com/problems/first-bad-version/
public class FirstBadVersion {
    public static void main(String[] args) {

    }

// This is the binary search approach!
    // RUNTIME :
//    public static int firstBadVersion(int n){
//        int end = n;
//        int start = 1;
//        int badVersion = 0;
//        while (start <= end){
//            int mid = start + (end-start)/2;
//            if(isBadVersion(mid)){
//                badVersion = mid;
//                end = mid-1;
//            }
//            else{
//                start = mid+1;
//            }
//        }
//        return badVersion;
//    }

// Linear search approach!
    // RUNITME : Time limit exceeded !
//    public static int firstBadVersion(int n){
//        int firstBadVersion = 0;
//        int count = 1;
//        while !(isBadVersion(count)){
//            count ++;
//        }
//        firstBadVersion = count;
//        return firstBadVersion
//    }
}

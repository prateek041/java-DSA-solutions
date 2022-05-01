package com.company;
// Runtime: 1 ms, faster than 85.76% of Java online submissions for Kids With the Greatest Number of Candies.
// link : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
import java.util.ArrayList;
import java.util.List;

public class maximumCandies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>(candies.length);
        int maxCandies = candies[0];
        for (int numberOfCandies : candies) {
            if (numberOfCandies > maxCandies) {
                maxCandies = numberOfCandies;
            }
        }
        // checking every increased number of candies with max number of candies in the candies list.
        for (int candiesIndex = 0; candiesIndex < candies.length; candiesIndex++) {
            int newNumberOfCandies = candies[candiesIndex] + extraCandies;
            if (newNumberOfCandies >= maxCandies) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
// this was my initial try.
//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        List<Boolean> list= new ArrayList<>(candies.length);
//        for (int child = 0; child < candies.length; child++) {
//            int numberOfCandies = candies[child];
//            // adding the extra number of candies.
//            int newNumberOfCandies = numberOfCandies + extraCandies;
//            int max = newNumberOfCandies;
//            for (int i = 0; i < candies.length; i++) {
//                if (candies[i] > max){
//                    max = candies[i];
//                }
//            }
//            if (max == newNumberOfCandies){
//                list.add(true);
//            }
//            else{
//                list.add(false);
//            }
//        }
//        return list;
//    }
}


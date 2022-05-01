package com.company;
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Richest Customer Wealth.
// link : https://leetcode.com/problems/richest-customer-wealth/
public class richestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3,5}};
        System.out.println(maximumWealth(accounts));
    }


    public static int maximumWealth(int[][] accounts) {
        int[] totalAmount = new int[accounts.length];
        int index = 0;
        for (int[] holder : accounts) {
            int sum = 0;
            for (int wealth : holder) {
                sum += wealth;
            }
            totalAmount[index] = sum;
            index++;
        }
        int maxAmount = totalAmount[0];
        for (int i = 1; i < totalAmount.length; i++) {
            if (totalAmount[i] > maxAmount){
                maxAmount = totalAmount[i];
            }
        }
        return maxAmount;
    }
}

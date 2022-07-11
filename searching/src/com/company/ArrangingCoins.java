package com.company;

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(arrangeCoins(n));
    }

    public static int arrangeCoins(int n){
        int ans = 0;
        int rows = 1;
        int columns = 1;
        while (n>0){
            for (int row = 0; row < rows; row++) {
                for (int column = 0; column < columns; column++) {
                    n--;
                }
                columns++;
            }
            ans = rows;
            rows++;
        }
        return ans;
    }
}

package com.company;

public class MinMax {
    public static void main(String[] args) {
        int [] arr = {1, 4, 45, 6, 10, -8};
        System.out.println(arr[maxNum(arr, 0, 1)]);
    }

    static int maxNum(int [] arr, int maxIndex, int checkIndex){
        if(checkIndex > arr.length-1){
            return maxIndex;
        }

        if(arr[checkIndex] > arr[maxIndex]){
            maxIndex = checkIndex;
        }

        return maxNum(arr, maxIndex, checkIndex+1);
    }
}

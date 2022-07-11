package com.company;

import java.util.Arrays;

public class SumTriangle {

    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4, 5};
//        System.out.println(arr.length);
        sum(arr);
    }

    static void sum(int [] arr){
        if(arr.length<1){
            return;
        }
        int[] newArray = new int[arr.length-1];
        for(int i = 0; i<arr.length-1; i++){
            newArray[i] = arr[i] + arr[i+1];
        }
        System.out.println("This is new array" + Arrays.toString(newArray));
        System.out.println(Arrays.toString(arr));
        sum(newArray);
    }
}

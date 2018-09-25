package com.Manbir.arraysandstrings.exercise1;

import java.util.Arrays;

public class Q5 {
//    Write a function that when given an integer array moves all the zeroes to the end of the array

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 0, 0, 5, 7, 8, 0, 0, 7};
        moveZerosToEnd(arr1);

    }

    public static void moveZerosToEnd(int[] arr1) {
        if ((arr1 == null) || (arr1.length == 0)) {
            System.out.println("empty array");
        }
        int[] arr2 = new int[arr1.length];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 0) {
                arr2[j] = arr1[i];
                j++;
            }
        }

        for (int i = j; i < arr2.length; i++) {
            arr2[j] = 0;
            j++;
        }
        System.out.println(Arrays.toString(arr2));
    }

}

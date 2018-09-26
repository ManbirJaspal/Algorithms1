package com.Manbir.arraysandstrings.exercise1;


//    Write a function that when given an integer array prints only the negative entries

public class Q2 {

    public static void main(String args[]) {
        int[] arr = new int[]{1, 2, 4, 4, 5, 6, -7, -8, 33, -4, 5, 4, -45};
        arrayNeg(arr);

    }

    public static void arrayNeg(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("empty array");
            return;


        }
        for (int e : arr) {
            if (e < 0) {
                System.out.println("hello:  " + e);
            }
        }
    }
}

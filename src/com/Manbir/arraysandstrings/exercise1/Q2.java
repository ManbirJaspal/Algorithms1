package com.Manbir.arraysandstrings.exercise1;


//    Write a function that when given an integer array prints only the negative entries

public class Q2 {

    public static void main(String args[]) {
        int[] arr = new int[]{1, 2, -3, 5, 7, -32, 5, -7, 7};
        arrayNeg(arr);

    }

    public static void arrayNeg(int[] arr) {
        if (arr != null && arr.length != 0) {

            for (int e : arr) {
                if (e < 0) {
                    System.out.println(e);
                }
            }
        } else System.out.println("empty array");
    }
}

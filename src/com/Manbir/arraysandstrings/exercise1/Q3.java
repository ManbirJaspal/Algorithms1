package com.Manbir.arraysandstrings.exercise1;

import java.util.Arrays;

public class Q3 {
//    Write a function that when given a char array replaces all ‘b’s with ‘9’s

    public static void main(String args[]) {
        char[] arr = new char[]{'a', 'B', 'e', 'd', 'e', 'b', 'r', 'b', 'z', 'e'};
        replaceWith9(arr);
    }

    public static void replaceWith9(char[] arr) {
        if ((arr == null) || (arr.length == 0)) {
            System.out.println("empty array");
        }

        for (int i = 0; i < arr.length; i++) {
            if (Character.toLowerCase(arr[i]) == 'b') {
                arr[i] = '9';
            }
        }

        System.out.println("the array after replacing is: " + Arrays.toString(arr));
    }
}
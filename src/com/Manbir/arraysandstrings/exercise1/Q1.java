package com.Manbir.arraysandstrings.exercise1;

//Write a function that when given an integer array returns it’s sum
public class Q1 {

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,5,7,32,5,7,7};
        System.out.println("The total after the sum is: " + arraySum(arr));

    }

    private static int arraySum(int[] arr) {
        if ((arr == null) || (arr.length ==  0)) {
            return -1;
        }

        int sum = 0;
        for (int e : arr) {
            sum = sum + e;
        }

        return sum;
    }
}

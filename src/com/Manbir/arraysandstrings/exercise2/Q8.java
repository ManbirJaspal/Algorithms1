package com.Manbir.arraysandstrings.exercise2;

public class Q8 {
    //Write a function to reverse a given string

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 += str1.charAt(i);
        }

        System.out.println(str2);
    }
}

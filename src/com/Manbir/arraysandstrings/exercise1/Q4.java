package com.Manbir.arraysandstrings.exercise1;

public class Q4 {
//    Write a function that when given a string array outputs “police” when it encounters “cop” and “robber” when it encounters “thief”

    public static void main(String args[]) {

        String[] strArr = null;                         // new String[] {"cop", "thief"};
        functionQ4(strArr);
    }

    private static void functionQ4(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            System.out.println("empty array");
            return;
        }
        for (String e : strArr) {
            if (e.equals("cop")) {
                System.out.print("police \n");
            }

            if (e.equals("thief")) {
                System.out.println("robber");
            }
        }

    }
}

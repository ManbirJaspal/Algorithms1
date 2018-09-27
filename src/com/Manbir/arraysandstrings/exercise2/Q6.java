package com.Manbir.arraysandstrings.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q6 {
//    Write a function that takes in an Integer array and returns a list of indexes where null is present.

    public static void main(String[] args) {
        Integer[] al1 = new Integer[]{1, 23, 2, 1, 3, null, 4, 3, null, null, 23, null};
        System.out.println(getNullIndex(al1));
    }

    public static List<Integer> getNullIndex(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("empty array");
            return Collections.emptyList();
        }

        int index = 0;
        ArrayList<Integer> nullIndexList = new ArrayList<Integer>();
        for (Integer e : arr) {
            if (e == null) {
                nullIndexList.add(index);
                System.out.println("null present at index: " + index);
            }
            index++;
        }
        return nullIndexList;
    }
}




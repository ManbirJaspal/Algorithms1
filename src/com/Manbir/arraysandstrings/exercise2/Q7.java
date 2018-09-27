package com.Manbir.arraysandstrings.exercise2;

import java.util.HashMap;

public class Q7 {
//    Given a string, count how many times each character shows up in the string.

    public static void main(String[] args) {
        String string = "dhjwbcnwncwioendoiu2ebndjwebdowuedhwieodnqwedjqwebdiuydhweiodnqwejkd";
        countCharacters(string);
    }

    public static void countCharacters(String string) {
        HashMap<Character, Integer> chMap = new HashMap<Character, Integer>();
        char[] ch = string.toCharArray();

        for (Character chars : ch) {
            if (chMap.containsKey(chars)) {
                chMap.put(chars, chMap.get(chars + 1));
            } else {
                chMap.put(chars, 1);
            }
        }

    }
}




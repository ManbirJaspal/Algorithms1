package com.Manbir.arraysandstrings.exercise2;

import java.util.HashMap;

//Write a function that takes in a string and iterates over each character of the string and returns the first repeated character

public class Q9 {
    public static void main(String args[]) {
        String str = "sdjncsicnhwucnweucjnwej3d";
        firstRepeatedCharacter(str);

    }

    public static void firstRepeatedCharacter(String string) {
        HashMap<Character, Integer> chMap = new HashMap<Character, Integer>();
        char[] ch = string.toCharArray();

        for (Character chars : ch) {
            if (chMap.containsKey(chars)) {
                System.out.println("The first repeated character is: " + chars);
                break;
            } else {
                chMap.put(chars, 1);
            }
        }

    }
}

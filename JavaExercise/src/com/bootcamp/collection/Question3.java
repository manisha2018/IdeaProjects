/*
Write a method that takes a string and print the number of occurrence
of each character characters in the string
*/

package com.bootcamp.collection;

import java.util.HashMap;

public class Question3 {
    public static void occuranceOfChars(String inputString) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        char[] strArray = inputString.toLowerCase().replace(" ", "").toCharArray();

        for (char c : strArray) {

            if (hashMap.containsKey(c)) {

                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }

        }
        System.out.println(hashMap);

    }

    public static void main(String[] args) {

        occuranceOfChars("Java is not Pure");
        occuranceOfChars("Blahh blahh blaahh");
        occuranceOfChars("Bootcamp in TTN");

    }

}

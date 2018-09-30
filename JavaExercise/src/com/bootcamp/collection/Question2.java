//Write a method that takes a string and returns the number of unique characters in the string

package com.bootcamp.collection;

public class Question2 {
    public static void findUniqueChar(String inputString) {

        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            char current = inputString.charAt(i);
            if (temp.toString().indexOf(current) < 0) {
                temp.append(current);
            } else {
                temp = new StringBuilder(temp.toString().replace(String.valueOf(current), ""));
            }
        }

        System.out.println(temp);

    }


    public static void main(String[] args) {

        findUniqueChar("aabbccd");
        findUniqueChar("manisha goyal");

    }
}

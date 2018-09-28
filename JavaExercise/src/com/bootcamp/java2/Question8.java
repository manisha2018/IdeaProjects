/*WAP to read words from the keyboard until the word done is entered.
 For each word except done, report whether its first character is equal to its last character.
 For the required loop, use a
a)while statement
b)do-while statement


* */

package com.bootcamp.java2;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = keyboard.next();
        while (!word.equals("done")) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("First and last character are equals for the word: " + word);
            } else {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            word = keyboard.next();
        }

        System.out.println("---------------------------------------------------------");


        Scanner keyboardOfDoWhile = new Scanner(System.in);
        System.out.println("Enter a word");
        String wordInDoWhile = keyboardOfDoWhile.next();
        do {
            if (wordInDoWhile.charAt(0) == wordInDoWhile.charAt(wordInDoWhile.length() - 1)) {
                System.out.println("First and last character are equals for the word: " + wordInDoWhile);
            } else {
                System.out.println("First and last character are NOT equals for the word: " + wordInDoWhile);
            }
            wordInDoWhile = keyboardOfDoWhile.next();
        } while (!wordInDoWhile.equals("done"));

    }
}

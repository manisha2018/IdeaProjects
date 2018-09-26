//Write a program to find the number of occurrences of a character in a string without using loop
package com.ttn.java1;

import java.util.Scanner;

class ThirdQuestion {
    String originalString;
    String findalphabet;
    int count;

    public String input() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String:");
        originalString = input.nextLine();
        return originalString;
    }

    public int check() {
        System.out.println("Length Of String:" + originalString.length());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet you want to count:");
        findalphabet = sc.next();
        System.out.println("length of String without the character: "
                + originalString.replace(findalphabet, "").length());
        int count = originalString.length() - originalString.replace(findalphabet, "").length();
        System.out.println("Occurrence of the alphabet" + count);
        return count;
    }

}

public class Third {
    public static void main(String[] args) {
        ThirdQuestion three = new ThirdQuestion();
        three.input();
        three.check();

    }

}




//Write a program to find the number of occurrences of the duplicate words in a string and print them
package com.ttn.java1;

import java.util.Scanner;

class Second {

    String originalString;
    int count = 1;

    public String input() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String:");
        originalString = input.nextLine();
        return originalString;
    }

    public void logic() {
        String[] orgString = originalString.split(" ");
        for (int i = 0; i < orgString.length; i++) {
            for (int j = i + 1; j < orgString.length; j++) {
                if (orgString[i].equals(orgString[j])) {
                    count++;
                    orgString[j] = "0";
                }
            }
            if (!orgString[i].equals("0"))
                System.out.println(orgString[i] + " : " + count);
            count = 1;
        }

    }

    public static void main(String[] args) {
        Second second = new Second();
        second.input();
        second.logic();
    }

}

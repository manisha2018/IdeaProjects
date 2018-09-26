/*
Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters,
Digits And Other Special Characters In A String
*/
package com.ttn.java1;

import java.text.DecimalFormat;
import java.util.Scanner;

class FourthQuestion {
    String originalString;
    int upper;
    int lower;
    int digit;
    int specialCharacter;
    double upperPercent;
    double lowerPercent;
    double digitPercent;
    double specialPercent;

    public void input() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String:");
        originalString = input.nextLine();
        check();

    }

    public void check() {
        char[] letters = originalString.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (Character.isUpperCase(letters[i])) {
                upper++;
            } else if (Character.isLowerCase(letters[i])) {
                lower++;
            } else if (Character.isDigit(letters[i])) {
                digit++;
            } else {
                specialCharacter++;
            }
        }
        findPercentage();
    }

    public void findPercentage() {
        upperPercent = ((double) upper / originalString.length()) * 100;
        lowerPercent = ((double) lower / originalString.length()) * 100;
        digitPercent = ((double) digit / originalString.length()) * 100;
        specialPercent = ((double) specialCharacter / originalString.length()) * 100;
        //print();
    }

    public void print() {
        DecimalFormat df = new DecimalFormat(".##");
        System.out.println("Number of uppercase:" + upper + "\tUpperCase Percentage" + df.format(upperPercent));
        System.out.println("Number of LowerCase:" + lower + "\tLowerCase Percentage" + df.format(lowerPercent));
        System.out.println("Number of Digits:" + digit + "\tDigit Percentage" + df.format(digitPercent));
        System.out.println("Number of Special Character:" + specialCharacter + "\tSpecial Character Percentage" + df.format(specialPercent));
    }
}

public class Fourth {
    public static void main(String[] args) {

        FourthQuestion fq = new FourthQuestion();
        fq.input();
        fq.print();
    }
}



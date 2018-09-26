//Write a program to replace a substring inside a string with other string
package com.ttn.java1;

import java.util.Scanner;

public class First {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the String:");
        String originalString= input.nextLine();

        Scanner subInput= new Scanner(System.in);
        System.out.println("Enter the Sub String you want to replace:");
        String subString = subInput.nextLine();

        Scanner newInput= new Scanner(System.in);
        System.out.println("Enter the new string:");
        String newString = newInput.nextLine();

        String replaceString=originalString.replaceAll(subString,newString);
        System.out.println(replaceString);
    }

}

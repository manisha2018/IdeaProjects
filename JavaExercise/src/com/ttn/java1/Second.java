//Write a program to find the number of occurrences of the duplicate words in a string and print them
package com.ttn.java1;

import java.util.Scanner;

public class Second {

     String originalString;
     int count=0;

    public String input(){

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the String:");
        originalString= input.nextLine();
        return originalString;
    }
    public void logic(){

        char ch[]= originalString.toCharArray();
        for(int i=0 ;i<originalString.length();i++){
            for(int j=i+1;j<originalString.length();j++)
            {
//                if (originalString[i].equals(originalString[j])) {
//                    count=count+1;
//                    originalString[j]=0;
                }
            }
        }


    public static void main(String[] args){

    }

}

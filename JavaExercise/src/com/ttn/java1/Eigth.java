/*
Write a program to reverse a string and
        remove character from index 4 to index 9 from the reversed string using String Buffer
*/
package com.ttn.java1;

public class Eigth {
    public static void main(String[] args) {


        StringBuffer stringBuffer = new StringBuffer("TTN Bootcamp");

        System.out.println("Input String :"+stringBuffer);
        StringBuffer reverseStr = stringBuffer.reverse();
        System.out.println("Reverse of String : "+reverseStr);

        String subString = reverseStr.substring(4,10);

        StringBuffer deletedString = reverseStr.delete(4,10);

        System.out.println("Substring of String: "+subString);
        System.out.println("String after deleting substring : "+deletedString);



    }
}

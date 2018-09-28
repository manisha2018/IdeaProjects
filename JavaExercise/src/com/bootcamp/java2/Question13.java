//Create a custom exception that do not have any stack trace.

package com.bootcamp.java2;

import java.util.Scanner;

class AgeIsNegativeException extends Exception {
    String errorMessage;

    public AgeIsNegativeException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return errorMessage;
    }
}


public class Question13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Age");

        int age = sc.nextInt();

        try {
            if (age < 0) {
                throw new AgeIsNegativeException("Age can not be negative");
            } else {
                System.out.println("Your age is " + age);
            }
        } catch (AgeIsNegativeException ex) {
            System.out.println(ex);
            ex.printStackTrace();

        }
    }

}
/*Write a program to print your Firstname,LastName & age using static block,
static method & static variable respectively*/
package com.ttn.java1;

public class Seventh {
    static String firstName;
    static String lastName;
    static int age;

    static {
        firstName = "Manisha";
        lastName = "Goyal";
        age = 23;
        System.out.println("***********From Static Block**********");
        System.out.println("First Name : "+firstName);
        System.out.println("Last Name : "+lastName);
        System.out.println("Age : "+age);
    }


    static void staticMethod() {

        System.out.println("*************From Static Method***************");
        System.out.println("First Name :" + firstName);
        System.out.println("Last Name :" + lastName);
        System.out.println("Age " + age);

    }

    public static void main(String[] args) {
        Seventh.age = 23;
        Seventh.staticMethod();
    }
}


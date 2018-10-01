/* Implement following functional interfaces from java.util.functionusing lambdas:
Consumer

Supplier

 Predicate

 Function
* */

package com.bootcamp.java8;

import java.util.function.Predicate;

public class Question2 {
    public static void main(String[] args) {
        Predicate<Integer> isNumberOdd = (n) -> (n % 2 != 0) ? true : false;
        System.out.println("Is number is odd? " + isNumberOdd.test(11));
    }
}
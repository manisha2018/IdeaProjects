/* Implement following functional interfaces from java.util.functionusing lambdas:
Consumer

Supplier

 Predicate

 Function
* */

package com.bootcamp.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question2 {
    public static void main(String[] args) {
        Predicate<Integer> isNumberOdd = (n) -> (n % 2 != 0) ? true : false;
        System.out.println("Is number is odd? " + isNumberOdd.test(12));

        Consumer < String > consumer1 = a -> System.out.println(a + "OK");
        consumer1.accept("Consumer Example ");

        Supplier<String> supplier=()->"Supplier Example";
        System.out.println(supplier.get());

        Function<Integer,Integer> function=x->x+1;
        System.out.println("Function Example: "+function.apply(5));
    }
}
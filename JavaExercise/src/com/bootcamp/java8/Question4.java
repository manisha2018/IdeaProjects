//Sum all the numbers greater than 5 in the integer list.
package com.bootcamp.java8;

import java.util.Arrays;
import java.util.List;

public class Question4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 2, 5, 6, 8, 4, 3, 9, 7);
        System.out.println("Numbers greater than 5 are");
        list.stream().filter((e) -> e > 5).forEach(System.out::println);
        System.out.println("Sum is:" + list.stream().filter((e) -> e > 5).mapToInt(e -> e).sum());
    }
}

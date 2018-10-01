//Collect all the even numbers from an integer list.

package com.bootcamp.java8;

import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 2, 5, 6, 8, 4, 3, 9, 7);
        list.stream().filter((e) -> e % 2 == 0).forEach(System.out::print);
    }
}

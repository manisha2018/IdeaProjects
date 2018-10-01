//Find the first even number in the integer list which is greater than 3.
package com.bootcamp.java8;

import java.util.Arrays;
import java.util.List;

public class Question6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 5, 6, 7);
        System.out.println("First Number is:" + list.stream().filter((e) -> e > 3)
                .filter((e) -> e % 2 == 0).findFirst());
    }
}

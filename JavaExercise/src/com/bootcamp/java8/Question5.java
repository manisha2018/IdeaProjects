//Find average of the number inside integer list after doubling it.
package com.bootcamp.java8;

import java.util.Arrays;
import java.util.List;

public class Question5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        Double average = list.stream().mapToInt(val -> val * 2).average().orElse(0.0);
        System.out.println("The Average of list is:" + average);
    }
}

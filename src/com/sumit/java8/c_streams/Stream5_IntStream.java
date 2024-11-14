package com.sumit.java8.c_streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Stream5_IntStream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        // sum of 1,2,3 using IntStream
        int sum = list.stream().mapToInt(i -> i.intValue()).sum();
        System.out.println("Sum of 1, 2, 3 = " + sum);

        OptionalInt max = list.stream().mapToInt(i -> i.intValue()).max();
        System.out.println("Max of 1, 2, 3 = " + max.orElse(Integer.MIN_VALUE));
    }

}
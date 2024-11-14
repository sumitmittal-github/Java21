package com.sumit.java8.c_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream7_Reduce {

    //Assignment : calculate max value using reduce()

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 47, 33, 23);

        // output should be Optional<T>
        Optional<Integer> ans1 = list.stream()
                                     .reduce( (i1, i2) -> Integer.max(i1, i2));
        System.out.println(ans1.orElse(Integer.MIN_VALUE));

        // output should be T
        Integer ans2 = list.stream()
                           .reduce(Integer.MIN_VALUE, (i1, i2) -> Integer.max(i1, i2));        // because we have given an initial value. Hence, answer can not be Optional
        System.out.println(ans2);

    }

}
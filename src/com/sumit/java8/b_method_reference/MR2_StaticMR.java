package com.sumit.java8.b_method_reference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class MR2_StaticMR {

    public static void main(String[] args) {

        // without MR
        List<Integer> numbers = Arrays.asList(4, 3, 2, 1);
        System.out.println("Before sorting : " + numbers);

        Consumer<List<Integer>> consumerL = list -> Collections.sort(list);
        consumerL.accept(numbers);
        System.out.println("After sorting  : " + numbers);


        // with MR
        numbers = Arrays.asList(4, 3, 2, 1);
        System.out.println("Before sorting : " + numbers);

        Consumer<List<Integer>> consumerMR = Collections::sort;
        consumerMR.accept(numbers);
        System.out.println("After sorting  : " + numbers);
    }

}
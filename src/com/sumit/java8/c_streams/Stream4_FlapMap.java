package com.sumit.java8.c_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream4_FlapMap {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b");
        List<String> list2 = Arrays.asList("d", "c");
        List<String> list3 = Arrays.asList("a", "c");

        List<String> listOfStrings = Stream.of(list1, list2, list3)
                .filter(list -> list.contains("c"))     // [d c]  [a c]
                .flatMap(list -> list.stream())         // [d c a c]
                .sorted()                               // [a c c d]
                .distinct()                             // [a c d]
                .collect(Collectors.toList());

        System.out.println(listOfStrings);
    }

}
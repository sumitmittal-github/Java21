package com.sumit.java8.c_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class S1_PrimitiveToObjectConversion {

    public static void main(String[] args) {

        // Stream<String> -> Stream<String>
        List<String> list = Stream.of("Sumit", "Lokesh")
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(list);

        // Stream<String> -> Stream<Integer>
        List<String> stringList = Arrays.asList("3", "6", "8", "14", "15");
        stringList.stream().map(num -> Integer.parseInt(num))
                .forEach(s -> System.out.print(s + " "));

        // Primitive int to long conversion
        IntStream.of(1,2,3)
                .mapToLong(n -> (long)n*2)
                .forEach(s -> System.out.print(s + " "));
    }

}
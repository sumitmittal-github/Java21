package com.sumit.java8.a_lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda4_Function_BiFunction {

    public static void main(String[] args) {

        // Function example-1
        Function<String, Integer> function1 = s -> s.length();
        System.out.println(function1.apply("Sumit Mittal"));


        // BiFunction example-1
        BiFunction<String, String, Integer> biFunction1 = (s1, s2) -> s1.length() + s2.length();
        System.out.println(biFunction1.apply("Sumit ", "Mittal"));

        // BiFunction example-2
        BiFunction<String, String, String> biFunction2 = (s1, s2) -> s1.concat(s2);
        System.out.println(biFunction2.apply("Sumit ", "Mittal"));


    }

}
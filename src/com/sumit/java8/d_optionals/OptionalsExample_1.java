package com.sumit.java8.d_optionals;

import java.util.Arrays;
import java.util.Optional;

public class OptionalsExample_1 {

    public static Optional<Double> average(int... numbers){
        if(numbers.length == 0)
            return Optional.empty();
        else {
            int total = Arrays.stream(numbers).sum();
            double avg = (double)total / numbers.length;
            return Optional.of(avg);
        }
    }

    public static void method1_emptyInput() {

        // calling average with empty array
        Optional<Double> res = average();

        // way-1
        res.ifPresent(System.out::println);

        // way-2
        if(res.isPresent())
            System.out.println(res.get());
        else
            System.out.println("No result found");

        // way-3
        res.orElse(Double.NaN);

        // way-4
        res.orElseGet(() -> Math.random());
    }

    public static void method2_validInput() {

        // calling average with empty array
        Optional<Double> res = average(10, 20, 30, 30);

        // way-1
        res.ifPresent(System.out::println);

        // way-2
        if(res.isPresent())
            System.out.println(res.get());
        else
            System.out.println("No result found");

        // way-3
        res.orElse(Double.NaN);

        // way-4
        res.orElseGet(() -> Math.random());
    }

    public static void main(String[] args) {
        method1_emptyInput();
        method2_validInput();
    }

}
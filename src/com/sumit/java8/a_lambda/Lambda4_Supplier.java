package com.sumit.java8.a_lambda;

import java.time.LocalTime;
import java.util.function.Supplier;

public class Lambda4_Supplier {

    public static void main(String[] args) {
        Supplier<StringBuilder> supplier1 = () -> new StringBuilder();
        System.out.println("New SB object = " + supplier1.get().append("test"));

        Supplier<LocalTime> supplier2 = () -> LocalTime.now();
        System.out.println("Local Time = " + supplier2.get());

        Supplier<Double> supplier3 = () -> Math.random();
        System.out.println("Random double = " + supplier3.get());
    }

}
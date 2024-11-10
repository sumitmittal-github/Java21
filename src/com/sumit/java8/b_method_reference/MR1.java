package com.sumit.java8.b_method_reference;

import java.util.function.Function;

public class MR1 {

    public static void main(String[] args) {

        Function<String, String> functionL = s -> s.toUpperCase();
        System.out.println(functionL.apply("Lokesh is my brother."));

        Function<String, String> functionMR = String::toUpperCase;
        System.out.println(functionMR.apply("Lokesh is my brother."));
    }

}
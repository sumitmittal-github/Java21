package com.sumit.java8.a_lambda;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Lambda5_Unary_Binary {

    public static void main(String[] args) {

        // Unary Operator : Function with same data type
        UnaryOperator<String> unaryOperator = s -> "My name is "+s;
        System.out.println(unaryOperator.apply("Sumit Mittal"));

        // Binary Operator : BiFunction with same data type
        BinaryOperator<String> binaryOperator = (s1, s2) -> s1.concat(s2);
        System.out.println(binaryOperator.apply("Sumit ", "Mittal"));

    }

}
package com.sumit.java8.a_lambda;

import java.util.function.Predicate;

public class Lambda1 {

    public static void main(String[] args) {

        Predicate<Integer> isNegativePredicate = i -> i < 0;

        System.out.println("Is -1 Negative : " + isNegativePredicate.test(-1));
        System.out.println("Is 1 Negative  : " + isNegativePredicate.test(1));
    }



}
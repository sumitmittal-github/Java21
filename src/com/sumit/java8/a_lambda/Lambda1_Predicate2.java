package com.sumit.java8.a_lambda;

import java.util.function.Predicate;

public class Lambda1_Predicate2 {

    // created a method which is
    public static <T> boolean check(T t, Predicate<T> predicate){
        return predicate.test(t);
    }

    public static void main(String[] args) {

        Predicate<Integer> isEvenPredicate = i -> i%2 == 0;
        System.out.println("Is 100 even : " + check(100, isEvenPredicate));
        System.out.println("Is 101 even : " + check(101, isEvenPredicate));

        Predicate<String> isMalePredicate = s -> s.startsWith("Mr.");
        System.out.println("Is Mr. Mittal male : " + check("Mr. Mittal", isMalePredicate));
        System.out.println("Is Ms. Mittal male : " + check("Ms. Mittal", isMalePredicate));
    }

}
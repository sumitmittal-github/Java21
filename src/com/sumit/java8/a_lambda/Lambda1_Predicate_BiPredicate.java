package com.sumit.java8.a_lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Lambda1_Predicate_BiPredicate {

    public static <T> boolean check(T t, Predicate<T> predicate){
        return predicate.test(t);
    }

    public static void main(String[] args) {

        // Predicate example-1
        Predicate<Integer> isNegativePredicate = i -> i < 0;
        System.out.println("Is -1 Negative : " + isNegativePredicate.test(-1));
        System.out.println("Is 1 Negative  : " + isNegativePredicate.test(1));

        // Predicate example-2
        Predicate<Integer> isEvenPredicate = i -> i%2 == 0;
        System.out.println("Is 100 even : " + check(100, isEvenPredicate));
        System.out.println("Is 101 even : " + check(101, isEvenPredicate));

        // Predicate example-3
        Predicate<String> isMalePredicate = s -> s.startsWith("Mr.");
        System.out.println("Is Mr. Mittal male : " + check("Mr. Mittal", isMalePredicate));
        System.out.println("Is Ms. Mittal male : " + check("Ms. Mittal", isMalePredicate));



        // BiPredicate example-1
        BiPredicate<String, String> biPredicate1 = (s1, s2) -> s1.contains(s2);
        String string1 = "My city name is Montreal. It is in Quebec province.";
        System.out.println("Is from Toronto :  " + biPredicate1.test(string1, "Toronto"));
        System.out.println("Is from Montreal : " + biPredicate1.test(string1, "Montreal"));

        // BiPredicate example-2
        BiPredicate<String, Integer> biPredicate2 = (str, len) -> str.length() == len;
        String string2 = "My city name is Montreal. It is in Quebec province.";
        System.out.println("Is input string length 50 :  " + biPredicate2.test(string2, 50));
        System.out.println("Is input string length 51 :  " + biPredicate2.test(string2, 51));
    }

}
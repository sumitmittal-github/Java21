package com.sumit.java8.a_lambda;

import java.util.function.BiPredicate;

public class Lambda3_BiPredicate {

    public static void main(String[] args) {

        BiPredicate<String, String> biPredicate1 = (s1, s2) -> s1.contains(s2);

        String string1 = "My city name is Montreal. It is in Quebec province.";
        System.out.println("Is from Toronto :  " + biPredicate1.test(string1, "Toronto"));
        System.out.println("Is from Montreal : " + biPredicate1.test(string1, "Montreal"));




        BiPredicate<String, Integer> biPredicate2 = (str, len) -> str.length() == len;

        String string2 = "My city name is Montreal. It is in Quebec province.";
        System.out.println("Is input string length 50 :  " + biPredicate2.test(string2, 50));
        System.out.println("Is input string length 51 :  " + biPredicate2.test(string2, 51));




    }

}
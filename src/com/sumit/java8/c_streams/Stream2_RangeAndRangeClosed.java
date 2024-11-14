package com.sumit.java8.c_streams;

import java.util.stream.IntStream;

public class Stream2_RangeAndRangeClosed {

    public static void main(String[] args) {
        sum();
        average();
    }

    public static void sum(){
        // IntStream range() example
        System.out.println("Sum from 1 to 10 is : " + IntStream.range(1, 11).sum());

        // IntStream rangeClosed() example
        System.out.println("Sum from 1 to 10 is : " + IntStream.rangeClosed(1, 10).sum());
    }

    public static void average(){
        // IntStream range() example
        System.out.println("Average from 1 to 10 is : " + IntStream.range(1, 11).average().orElse(0));

        // IntStream rangeClosed() example
        System.out.println("Average from 1 to 10 is : " + IntStream.rangeClosed(1, 10).average().orElse(0));
    }


}
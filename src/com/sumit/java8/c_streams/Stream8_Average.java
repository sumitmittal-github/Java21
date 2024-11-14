package com.sumit.java8.c_streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Stream8_Average {

    // Assignment-1 : Calculate the average price of the books whose price is > 10.0
    // Assignment-2 : Calculate the average price of the books whose price is > 90.0

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Java 8", 10.0),
                new Book("Java 21", 30.0),
                new Book("Java 17", 20.0)
        );

        double avg1 = books.stream()
                .filter(book -> book.getPrice()>10.0)
                .mapToDouble(book -> book.getPrice().doubleValue())
                .average().orElse(0.0);
        System.out.println(avg1);

        double avg2 = books.stream()
                .filter(book -> book.getPrice()>90.0)
                .mapToDouble(book -> book.getPrice().doubleValue())
                .average().orElse(0.0);
        System.out.println(avg2);
    }

}
package com.sumit.java8.c_streams;

import com.sumit.java8.Book;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream10_Map2 {

    // Assignment : List<Book> -> Map<String, Double> using collect()

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Basics of Java programming", 10.0),
                new Book("Basics of Java programming", 20.0),
                new Book("A journey to Java 21", 30.0),
                new Book("New features of Java 17", 20.0)
        );
        /*
        books.stream()
                .collect(Collectors.toMap(book -> book.getTitle(), book -> book.getPrice()))
                .forEach( (k,v) -> System.out.println(k + " : " + v));
        */

        // above code gave below exception, because duplicate keys
        // Exception in thread "main" java.lang.IllegalStateException: Duplicate key Basics of Java programming (attempted merging values 10.0 and 20.0)


        // Solution : collect() method allows aus to pass 3rd parameters in case keys are duplicate
        Map<String, Double> maps1 = books.stream()
                                         .collect( Collectors.toMap(     book -> book.getTitle(), book -> book.getPrice(),     (v1, v2) -> v1+v2));
        maps1.forEach( (k,v) -> System.out.println(k + " : " + v));



        Map<String, Double> maps2 = books.stream()
                                         .collect( Collectors.toMap(     book -> book.getTitle(), book -> book.getPrice(),     (v1, v2) -> v1+v2));
        maps2.forEach( (k,v) -> System.out.println(k + " : " + v));
    }

}
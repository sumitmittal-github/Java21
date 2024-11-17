package com.sumit.java8.c_streams;

import com.sumit.java8.Book;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Stream9_Map {

    // Assignment : List<Book> -> Map<String, Double>
    //            : Write a BiConsumer to output prices where title begins with 'A'

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Basics of Java programming", 10.0),
                new Book("A journey to Java 21", 30.0),
                new Book("New features of Java 17", 20.0)
        );


        Map<String, Double> map = books.stream().collect(Collectors.toMap(b -> b.getTitle(), b -> b.getPrice()));

        // option-1
        map.entrySet().stream().filter(entry -> entry.getKey().startsWith("A")).forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

        // option-2
        BiConsumer<String, Double> biConsumer = (k, v) -> {
            if(k.startsWith("A"))
                System.out.println(v);
        };
        map.forEach(biConsumer);

    }

}
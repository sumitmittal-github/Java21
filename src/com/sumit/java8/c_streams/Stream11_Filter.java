package com.sumit.java8.c_streams;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Stream11_Filter {

    // Assignment : Stream the people
    //              filter person's age < 30
    //              map to int primitive
    //              calculate the average age

    public static void main(String[] args) {

        List<Person> list = Arrays.asList(
            new Person("Happy", "Porwal", 13, new Date()),
            new Person("Sumit", "Sinha", 31, new Date()),
            new Person("Lokesh", "Zym", 33, new Date()),
            new Person("Jack", "Tiger", 19, new Date())
        );

        double averageAge = list.stream()
                .filter(p -> p.getAge()<30)
                .mapToInt(p -> p.getAge().intValue())
                .average().orElse(0.0);
        System.out.println("Average age = " + averageAge);
    }

}
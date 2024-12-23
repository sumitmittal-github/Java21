package com.sumit.java8.c_streams;

import com.sumit.java8.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3_Sorting {

    public static void main(String[] args) {

        // sorting a list of string
        List<String> names = Arrays.asList("Sumit", "Lokesh", "Ram");
        names.stream().sorted().forEach(System.out::println);
        // or
        List<String> names2 = names.stream().sorted().collect(Collectors.toList());
        System.out.println(names2);


        // sorting a list of custom object
        List<Person> list = Arrays.asList(
                new Person("Sumit", "Sinha", 21, new Date()),
                new Person("Lokesh", "Zym", 23, new Date()),
                new Person("Jack", "Tiger", 19, new Date())
        );

        // Approach-1 : sorting list by age
        list.stream().sorted((p1, p2) -> p1.getAge().compareTo(p2.getAge())).forEach(System.out::println);

        // Approach-2 : sorting list by age
        list.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
    }

}
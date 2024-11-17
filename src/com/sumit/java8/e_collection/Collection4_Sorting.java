package com.sumit.java8.e_collection;

import com.sumit.java8.Person;
import java.util.*;

public class Collection4_Sorting {

    // Sort persons by first name
    // if last name is same then by age

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Paul ", "Cunningham", 60, new Date()),
                new Person("Lokesh", "Mittal", 50, new Date()),
                new Person("Happy", "Arora", 20, new Date()),
                new Person("Lokesh", "Porwal", 40, new Date()),
                new Person("Sumit", "Sinha", 30, new Date()),
                new Person("Happy", "Porwal", 10, new Date())
        );

        Comparator<Person> comparator = Comparator.comparing(Person::getFirstName)
                //.thenComparing(Person::getLastName)
                .thenComparing(Person::getAge);

        Collections.sort(list, comparator);

        list.forEach(System.out::println);

    }

}
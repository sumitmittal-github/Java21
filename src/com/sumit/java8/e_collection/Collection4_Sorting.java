package com.sumit.java8.e_collection;

import com.sumit.java8.Person;
import java.util.*;

public class Collection4_Sorting {

    // Sort persons by first name
    // if first name is same, then by last name
    // if last name is same then by age

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Happy", "Porwal", 13, new Date()),
                new Person("Sumit", "Sinha", 31, new Date()),
                new Person("Lokesh", "Porwal", 33, new Date()),
                new Person("Happy", "Arora", 33, new Date()),
                new Person("Lokesh", "Mittal", 33, new Date()),
                new Person("Paul ", "Cunningham", 19, new Date())
        );

        Comparator<Person> comparator = Comparator.comparing(Person::getFirstName)
                .thenComparing(Person::getLastName)
                .thenComparing(Person::getAge);

        Collections.sort(list, comparator);

        System.out.println(list);
        
    }

}
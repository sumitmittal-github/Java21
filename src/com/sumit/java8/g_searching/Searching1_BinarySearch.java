package com.sumit.java8.g_searching;

import com.sumit.java8.Person;

import java.util.*;

public class Searching1_BinarySearch {

    public static void main(String[] args) {

        // list of person
        List<Person> list = Arrays.asList(
                new Person("B", "V", 30, new Date()),
                new Person("C", "U", 10, new Date()),
                new Person("A", "U", 40, new Date()),
                new Person("C", "X", 50, new Date()),
                new Person("A", "W", 30, new Date()),
                new Person("D ", "Y", 20, new Date())
        );

        // person we want to search in list
        Person p = new Person("C", "U", 10, new Date());
        Comparator<Person> comparator = Comparator.comparing(Person::getFirstName);

        int idx = Collections.binarySearch(list, p, comparator);
        System.out.println("Index of person = " + idx);
        
    }
    
    
    
}
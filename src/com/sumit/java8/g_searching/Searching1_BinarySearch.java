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


        // step-1 : sort the list with custom comparator
        Comparator<Person> comparator = Comparator.comparing(Person::getFirstName);
        Collections.sort(list, comparator);         //[A  A  B  C  C  D]

        // step-2 : pass custom comparator in the binary search
        Person p1 = new Person("C", "U", 10, new Date());
        int idx1 = Collections.binarySearch(list, p1, comparator);
        System.out.println("Index of person p1 = " + idx1);

        Person p2 = new Person("B", "V", 30, new Date());
        int idx2 = Collections.binarySearch(list, p2, comparator);
        System.out.println("Index of person p2 = " + idx2);
    }

}
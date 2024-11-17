package com.sumit.java8.c_streams;

import com.sumit.java8.Person;

import java.util.*;

public class Stream6_FindMaxPerson {

    //Assignment : using the max(comparator) from stream, calculate the oldest person

    public static void main(String[] args) {


        List<Person> list = Arrays.asList(
                new Person("Sumit", "Sinha", 21, new Date()),
                new Person("Lokesh", "Mittal", 23, new Date()),
                new Person("Jack", "Daniel", 19, new Date())
        );

        Optional<Person> oldestPerson1 = list.stream().max( (p1,p2) -> p1.getAge().compareTo(p2.getAge()));
                                                // OR
        Optional<Person> oldestPerson2 = list.stream().max(Comparator.comparing(p -> p.getAge()));
                                                // OR
        Optional<Person> oldestPerson3 = list.stream().max(Comparator.comparing(Person::getAge));

        if(oldestPerson1.isEmpty())
            System.out.println("No result");
        else
            System.out.println("Oldest person is = " + oldestPerson1.get());
    }

}
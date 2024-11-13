package com.sumit.java8.c_streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Streams3_Sorting {

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Sumit", 21, new Date()),
                new Person("Lokesh", 23, new Date()),
                new Person("Jack", 19, new Date())
                );

        // Approach-1 : sorting list by age
        list.stream().sorted( (p1, p2) -> p1.getAge().compareTo(p2.getAge())).forEach(System.out::println);

        // Approach-2 : sorting list by age
        list.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);


    }

}


@Data
@NoArgsConstructor
@AllArgsConstructor
class Person{
    private String name;
    private Integer age;
    private Date dateOfBirth;
}
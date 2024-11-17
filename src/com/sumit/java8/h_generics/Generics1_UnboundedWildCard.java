package com.sumit.java8.h_generics;

import com.sumit.java8.Person;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Generics1_UnboundedWildCard {

    public static void main(String[] args) {
        List<String> list1  = Arrays.asList("A", "B", "C");
        showList(list1);

        List<Integer> list2 = Arrays.asList(1, 2, 3);
        showList(list2);

        List<Person> list3  = Arrays.asList(
                new Person("A", "U", 40, new Date()),
                new Person("B", "V", 30, new Date())
        );
        showList(list3);
    }

    public static void showList(List<?> list){
        for(Object o : list){
            System.out.println(o);
        }
    }


}
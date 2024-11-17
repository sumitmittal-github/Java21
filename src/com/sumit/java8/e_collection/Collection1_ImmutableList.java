package com.sumit.java8.e_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection1_ImmutableList {

    // Different ways to create a Immutable list

    public static void main(String[] args) {
        List<String> tempList = new ArrayList<>();
        tempList.add("G");
        tempList.add("H");
        tempList.add("I");


        // Way-1
        List<String> immutable_list1 = Arrays.asList("A", "B", "C");

        // Way-2
        List<String> immutable_list2 = List.of("D", "E", "F");

        // Way-3
        List<String> immutable_list3 = List.copyOf(tempList);

    }

}
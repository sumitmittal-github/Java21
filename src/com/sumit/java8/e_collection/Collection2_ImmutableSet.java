package com.sumit.java8.e_collection;

import java.util.*;

public class Collection2_ImmutableSet {

    // Different ways to create a Immutable set

    public static void main(String[] args) {
        Set<String> tempSet = new HashSet<>();
        tempSet.add("G");
        tempSet.add("H");
        tempSet.add("I");


        // Way-1
        Set<String> immutable_set2 = Set.of("D", "E", "F");

        // Way-2
        Set<String> immutable_set3 = Set.copyOf(tempSet);

    }

}
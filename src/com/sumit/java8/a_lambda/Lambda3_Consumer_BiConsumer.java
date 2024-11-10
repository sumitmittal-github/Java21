package com.sumit.java8.a_lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Lambda3_Consumer_BiConsumer {

    public static void main(String[] args) {

        // Consumer example-1
        Consumer<String> consumer1 = s -> System.out.println(s);
        consumer1.accept("Printing this line");

        // Consumer example-2
        List<String> list = new ArrayList<>(); list.add("A");list.add("B");list.add("C");
        list.forEach(consumer1);



        // BiConsumer example-1
        Map<String, String> map = new HashMap<>();
        BiConsumer<String, String> biConsumer1 = (s1, s2) -> map.put(s1, s2);

        biConsumer1.accept("Quebec", "QC");
        biConsumer1.accept("Ontario", "ON");

        // BiConsumer example-2
        BiConsumer<String, String> biConsumer2 = (s1, s2) -> System.out.println(s1 +" -> "+ s2);
        map.forEach(biConsumer2);
    }

}
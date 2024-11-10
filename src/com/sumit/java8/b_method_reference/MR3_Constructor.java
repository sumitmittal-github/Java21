package com.sumit.java8.b_method_reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MR3_Constructor {

    public static void main(String[] args) {

        // example-1
        Supplier<List<Integer>> supplierL = () -> new ArrayList<>();
        List<Integer> list = supplierL.get();

        Supplier<List<Integer>> supplierMR = ArrayList::new;
        List<Integer> list2 = supplierL.get();


        // example-2
        Function<Integer, List<Integer>> functionL = size -> new ArrayList<>(size);
        List<Integer> list3 = functionL.apply(10);

        Function<Integer, List<Integer>> functionMR = ArrayList::new;
        List<Integer> list4 = functionL.apply(10);
    }

}
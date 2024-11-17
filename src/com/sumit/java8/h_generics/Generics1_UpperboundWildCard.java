package com.sumit.java8.h_generics;

import java.util.Arrays;
import java.util.List;

public class Generics1_UpperboundWildCard {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        showList(list1);

        List<Double> list2  = Arrays.asList(1.1, 2.2, 3.3);
        showList(list2);
    }

    public static void showList(List<? extends Number> list){
        //list.add(123);        CTE
        for(Number o : list){
            System.out.println(o);
        }
    }


}
package com.sumit.java8.h_generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics2_UpperboundWildCard {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        showList(list1);

        List<Double> list2  = new ArrayList<>();
        showList(list2);
    }

    public static void showList(List<? extends Number> list){
        //list.add(123);        CTE
        for(Number o : list){
            System.out.println(o);
        }
    }


}
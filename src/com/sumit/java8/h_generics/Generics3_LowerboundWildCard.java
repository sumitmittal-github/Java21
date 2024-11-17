package com.sumit.java8.h_generics;

import java.util.ArrayList;
import java.util.List;

public class Generics3_LowerboundWildCard {

    public static void main(String[] args) {
        List<Number> list1 = new ArrayList<>();
        showList(list1);

        List<Integer> list2 = new ArrayList<>();
        showList(list2);

        //List<Double> list3  = new ArrayList<>();
        //showList(list3);        //CTE
    }

    public static void showList(List<? super Integer> list){
        list.add(99);
        for(Object o : list){
            System.out.println(o);
        }
    }


}
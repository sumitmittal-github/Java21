package com.sumit.java11.c_annotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Annotation1_Examples {

    @Override
    public String toString(){
        return "overridden toString() of object class";
    }

    @SafeVarargs
    private static void print(List<String>... topics)
    {
        for (List<String> topic : topics) {
            System.out.println(topic);
        }
    }

    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Java 8");
        list.add("Java 11");
        print(list);
    }

}
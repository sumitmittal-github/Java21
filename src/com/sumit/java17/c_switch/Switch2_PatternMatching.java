package com.sumit.java17.c_switch;

public class Switch2_PatternMatching {

    public static void matchPattern(Object o){
        switch(o) {
            case String s -> System.out.println("String");
            case Integer i -> System.out.println("Integer");
            case null -> System.out.println("null");
            default -> System.out.println("Not recognized");
        }
    }

    public static void main(String[] args) {
        matchPattern("Sumit");
        matchPattern(123);
        matchPattern(null);
        matchPattern(123.4);
    }
    
}
package com.sumit.java21.d_pattern_matching;

public class PM_Example {

    public static String matchPattern(Object obj){
        return switch(obj){
            case String s -> "String";
            case Integer i when i < 100 -> "Integer less than 100";
            case Integer i when i > 100 -> "Integer greater than 100";
            case double[] arr -> "Double Array";
            case Long l -> {
                System.out.println("This is a block 1");
                System.out.println("This is a block 2");
                yield "Long";
            }
            case null, default -> "Invalid type";
        };
    }

    public static void main(String[] args) {
        System.out.println(matchPattern("Sumit"));
        System.out.println(matchPattern(35));
        System.out.println(matchPattern(135));
        System.out.println(matchPattern(new int[]{1,2,3,4,5}));
        System.out.println(matchPattern(new double[]{1.1,2.2,3.3,4.4,5.5}));
        System.out.println(matchPattern(12345678910111213L));
        System.out.println(matchPattern(null));
        System.out.println(matchPattern(123.45f));
    }

}
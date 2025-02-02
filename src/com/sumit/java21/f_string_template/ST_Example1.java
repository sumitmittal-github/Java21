package com.sumit.java21.f_string_template;

public class ST_Example1 {

    public static void main(String[] args) {
        example1("Sumit");
        example2("Sumit", 35, "Canada");

    }

    public static void example1(String name) {
        System.out.println(STR."Name is : \{name}");
    }

    public static void example2(String name, int age, String country) {
        String response = STR."""
                    Name is : \{name}
                    Age is : \{age}
                    Country is : \{country}
                """;
        System.out.println(response);
    }



}
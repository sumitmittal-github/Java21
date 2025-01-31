package com.sumit.java21.c_record_pattern;

record Employee(String name, int age){ }

public class RP_Example1 {

    public static void main(String[] args) {
        System.out.println("========== Type Pattern =================");
        typePattern("Lokesh-1");
        typePattern(new Employee("Sumit-1", 35));

        System.out.println("========== Record Pattern =================");
        recordPattern("Lokesh-2");
        recordPattern(new Employee("Sumit-2", 40));
    }

    public static void typePattern(Object obj){
        if(obj instanceof String s)
            System.out.println("String : " + s.toUpperCase());
        else if (obj instanceof Employee p)
            System.out.println("Employee ::: name = " + p.name() + ", age = " + p.age());
        else
            System.out.println("Unsupported type");
    }

    public static void recordPattern(Object obj){
        if(obj instanceof String s)
            System.out.println("String : " + s.toUpperCase());
        else if (obj instanceof Employee(String name, int age))
            System.out.println("Employee ::: name = " + name + ", age = " + age);
        else
            System.out.println("Unsupported type");
    }



}





package com.sumit.java21.c_record_pattern;

record Employee(String name, int age){ }

public class RP_Example1 {

    public static void main(String[] args) {
        System.out.println("===========================");
        check1("Lokesh-1");
        check1(new Employee("Sumit-1", 35));

        System.out.println("===========================");
        check2("Lokesh-2");
        check2(new Employee("Sumit-2", 40));
    }

    public static void check1(Object obj){
        if(obj instanceof String s)
            System.out.println("String : " + s.toUpperCase());
        else if (obj instanceof Employee p)
            System.out.println("Employee ::: name = " + p.name() + ", age = " + p.age());
        else
            System.out.println("Unsupported type");
    }

    public static void check2(Object obj){
        if(obj instanceof String s)
            System.out.println("String : " + s.toUpperCase());
        else if (obj instanceof Employee(String name, int age))
            System.out.println("Employee ::: name = " + name + ", age = " + age);
        else
            System.out.println("Unsupported type");
    }



}





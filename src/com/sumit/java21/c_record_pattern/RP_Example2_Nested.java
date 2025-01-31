package com.sumit.java21.c_record_pattern;

record Person(String name, Address address){ }
record Address(String country, String postalCode){ }

public class RP_Example2_Nested {

    public static void main(String[] args) {
        System.out.println("===== Type Pattern ======================");
        typePattern("Lokesh-1");
        typePattern(new Person("Sumit-1", new Address("India", "335063")));

        System.out.println("===== Record Pattern ======================");
        recordPattern("Lokesh-2");
        recordPattern(new Person("Sumit-2", new Address("Canada", "H2X 3P3")));
    }

    public static void typePattern(Object obj){
        if(obj instanceof String s)
            System.out.println("String : " + s.toUpperCase());
        else if (obj instanceof Person p)
            System.out.println("Person ::: name = " + p.name() + ", age = " + p.address());
        else
            System.out.println("Unsupported type");
    }

    public static void recordPattern(Object obj){
        if(obj instanceof String s)
            System.out.println("String : " + s.toUpperCase());
        else if (obj instanceof Person(String name, Address(String country, String postalCode)))
            System.out.println("Person ::: name = " + name + ", country = " + country + ", postalCode = " + postalCode);
        else
            System.out.println("Unsupported type");
    }

}





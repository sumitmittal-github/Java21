package com.sumit.java17.e_text_pattern;

public class TP1_Example {

    public static void main(String[] args) {
        System.out.println("=======================");
        traditionalInstanceOf("Sumit");
        traditionalInstanceOf(123);
        System.out.println("=======================");
        instanceOfWithTextPattern("Sumit");
        instanceOfWithTextPattern(123);
    }


    public static void traditionalInstanceOf(Object obj){
        if(obj instanceof String){
            String str = (String)obj;
            System.out.println("This is a string : " + str.toUpperCase());
        }
        else if(obj instanceof Integer){
            Integer i = (Integer)obj;
            System.out.println("This is a Integer : " + i);
        }
        else
            System.out.println("Unsupported Type");
    }

    public static void instanceOfWithTextPattern(Object obj){
        if(obj instanceof String s)
            System.out.println("This is a string : " + s.toUpperCase());
        else if(obj instanceof Integer i)
            System.out.println("This is a Integer : " + i);
        else
            System.out.println("Unsupported Type");

    }





}
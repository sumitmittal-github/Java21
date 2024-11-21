package com.sumit.java11.b_private;

public interface MyInterface {

    default void m1(){
        System.out.println("default method");
    }

    static void m2(){
        System.out.println("static method");
    }

    private void m3(){
        System.out.println("private method");
    }

    static private void m4(){
        System.out.println("static private method");
    }

    void m5();

}
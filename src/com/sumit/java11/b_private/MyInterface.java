package com.sumit.java11.b_private;

// Private methods in Interface

public interface MyInterface {

    // private method
    private void m3(){
        System.out.println("private method");
    }

    static private void m4(){
        System.out.println("static private method");
    }





    // default method
    default void m1(){
        System.out.println("default method");
    }





    // static method
    static void m2(){
        System.out.println("static method");
    }





    // abstract method
    void m5();

}
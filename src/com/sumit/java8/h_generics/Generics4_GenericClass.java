package com.sumit.java8.h_generics;

public class Generics4_GenericClass {

    public static void main(String[] args) {
        MyGeneric<String> g1 = new MyGeneric<>("Hello");
        System.out.println(g1.getInstance());

        MyGeneric<Integer> g2 = new MyGeneric<>(100);
        System.out.println(g2.getInstance());
    }

}

class MyGeneric<T> {

    T instance;

    public MyGeneric(T insance){
        this.instance = insance;
    }

    public T getInstance(){
        return instance;
    }

}
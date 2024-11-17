package com.sumit.java8.h_generics;

public class Generics5_GenericMethod {

    public static <T> void printAnyArray(T[] array){
        for(T element : array){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        printAnyArray(intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        printAnyArray(doubleArray);   // pass a Double array

        System.out.println("\nArray characterArray contains:");
        printAnyArray(charArray);   // pass a Character array
    }


}
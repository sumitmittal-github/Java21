package com.sumit.java8.a_lambda;

import java.util.function.Consumer;

public class Lambda6_Final_EffectivelyFinal {

    // class variable
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        Lambda6_Final_EffectivelyFinal obj = new Lambda6_Final_EffectivelyFinal();

        // local variable
        int x = 99;

        Consumer<Integer> consumer = i -> {

            // we can change 'a', because 'a' is not a local variable, but a class level variable
            System.out.println("a before change = " + obj.a);
            obj.a = 100;
            System.out.println("a after change  = " + obj.a);

            // we can change 'b', because 'b' is not a local variable, but a class level variable
            System.out.println("b before change = " + b);
            b = 200;
            System.out.println("b after change  = " + b);

            // we can not change x because x is a local variable
            //x=300;              //CTE : Local variables should be final or effectively final
            System.out.println(x);
        };
        consumer.accept(50);


        // we can change 'a', because 'a' is not a local variable, but a class level variable
        System.out.println("a before change = " + obj.a);
        obj.a = 1000;
        System.out.println("a after change  = " + obj.a);

        // we can change 'b', because 'b' is not a local variable, but a class level variable
        System.out.println("b before change = " + b);
        b = 2000;
        System.out.println("b after change  = " + b);

        // we can not change x because x is a local variable
        //x=3000;              //CTE : Local variables should be final or effectively final
        System.out.println(x);


    }

}
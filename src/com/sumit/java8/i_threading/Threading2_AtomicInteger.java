package com.sumit.java8.i_threading;

import java.util.concurrent.atomic.AtomicInteger;

public class Threading2_AtomicInteger {

    // Solution-1 of Race condition : Atomic Integer

    static AtomicInteger counter = new AtomicInteger(0);

    public static void addToCounter(){
        System.out.println("Before : " + counter + "by Thread id = " + Thread.currentThread().threadId());
        System.out.println("After  : " + counter.incrementAndGet() + "by Thread id = " + Thread.currentThread().threadId());
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i=0; i<10; i++){
            new Thread( () -> addToCounter() ).start();
        }
        Thread.sleep(1000);
        System.out.println("Final value should be 10. And it is = " + counter);
    }

}
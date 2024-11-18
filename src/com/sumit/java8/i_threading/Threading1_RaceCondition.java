package com.sumit.java8.i_threading;

public class Threading1_RaceCondition {

    static int counter = 0;

    public static void addToCounter(){
        int temp = counter;
        System.out.println("Before : " + counter + "by Thread id = " + Thread.currentThread().threadId());
        counter = temp+1;
        System.out.println("After  : " + counter + "by Thread id = " + Thread.currentThread().threadId());
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i=0; i<10; i++){
            new Thread( () -> addToCounter() ).start();
        }
        Thread.sleep(1000);
        System.out.println("Final value should be 10. And it is = " + counter);
    }




}
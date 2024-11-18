package com.sumit.java8.i_threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Threading4_Lock {

    // Solution-3 of Race condition : Lock interface
    private static final Lock lock = new ReentrantLock();

    static int counter = 0;

    public static void addToCounter_option1(){
        try{
            lock.lock();
            int temp = counter;
            System.out.println("Before : " + counter + "by Thread id = " + Thread.currentThread().threadId());
            counter = temp+1;
            System.out.println("After  : " + counter + "by Thread id = " + Thread.currentThread().threadId());
        } finally {
            lock.unlock();
        }
    }

    public static void addToCounter_option2(){
        if(lock.tryLock()){
            try{
                int temp = counter;
                System.out.println("Before : " + counter + "by Thread id = " + Thread.currentThread().threadId());
                counter = temp+1;
                System.out.println("After  : " + counter + "by Thread id = " + Thread.currentThread().threadId());
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Not able to get the lock. Please take some alternate approach for increment.");
        }
    }



    public static void main(String[] args) throws InterruptedException {

        // Option-1 : Blocking lock
        for(int i=0; i<10; i++){
            new Thread( () -> addToCounter_option1() ).start();
        }
        Thread.sleep(1000);
        System.out.println("Final value should be 10. And it is = " + counter);
        System.out.println("==============================");


        // Option-2 : Non-Blocking lock
        for(int i=0; i<10; i++){
            new Thread( () -> addToCounter_option2() ).start();
        }
        Thread.sleep(1000);
        System.out.println("Final value should be 20. And it is = " + counter);
        System.out.println("==============================");
    }

}
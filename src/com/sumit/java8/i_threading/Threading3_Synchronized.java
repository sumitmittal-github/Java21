package com.sumit.java8.i_threading;

public class Threading3_Synchronized {

    // Solution-2 of Race condition : Synchronized keyword (Synchronized method AND Synchronized block)

    static int counter = 0;

    public static synchronized void addToCounter_option1(){
        int temp = counter;
        System.out.println("Before : " + counter + "by Thread id = " + Thread.currentThread().threadId());
        counter = temp+1;
        System.out.println("After  : " + counter + "by Thread id = " + Thread.currentThread().threadId());
    }

    public static void addToCounter_option2(){
        synchronized (Threading3_Synchronized.class) {
            int temp = counter;
            System.out.println("Before : " + counter + "by Thread id = " + Thread.currentThread().threadId());
            counter = temp+1;
            System.out.println("After  : " + counter + "by Thread id = " + Thread.currentThread().threadId());
        }
    }

    private static final Object object = new Object();
    public static void addToCounter_option3(){
        synchronized (object) {
            int temp = counter;
            System.out.println("Before : " + counter + "by Thread id = " + Thread.currentThread().threadId());
            counter = temp+1;
            System.out.println("After  : " + counter + "by Thread id = " + Thread.currentThread().threadId());
        }
    }

    public void addToCounter_option4(){
        synchronized (this) {
            int temp = counter;
            System.out.println("Before : " + counter + "by Thread id = " + Thread.currentThread().threadId());
            counter = temp+1;
            System.out.println("After  : " + counter + "by Thread id = " + Thread.currentThread().threadId());
        }
    }


    public static void main(String[] args) throws InterruptedException {

        // Option-1 : static Synchronized method
        for(int i=0; i<10; i++){
            new Thread( () -> addToCounter_option1() ).start();
        }
        Thread.sleep(1000);
        System.out.println("Final value should be 10. And it is = " + counter);
        System.out.println("==============================");


        // Option-2 : static Synchronized block
        for(int i=0; i<10; i++){
            new Thread( () -> addToCounter_option2() ).start();
        }
        Thread.sleep(1000);
        System.out.println("Final value should be 20. And it is = " + counter);
        System.out.println("==============================");


        // Option-3 : instance Synchronized block with object
        for(int i=0; i<10; i++){
            new Thread( () -> addToCounter_option3() ).start();
        }
        Thread.sleep(1000);
        System.out.println("Final value should be 30. And it is = " + counter);
        System.out.println("==============================");


        // Option-4 : instance Synchronized block with this
        Threading3_Synchronized instance = new Threading3_Synchronized();
        for(int i=0; i<10; i++){
            new Thread( () -> instance.addToCounter_option4() ).start();
        }
        Thread.sleep(1000);
        System.out.println("Final value should be 40. And it is = " + counter);
        System.out.println("==============================");

    }

}
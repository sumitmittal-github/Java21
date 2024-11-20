package com.sumit.java8.k_io;


import java.io.Console;

public class IO3_Console {

    public static void main(String[] args) throws Exception {

        Console console = System.console();
        if(console == null)
            System.out.println("Console not available. Your IDE has the console instance");
        else {
            //
            //
            //

        }
    }

}
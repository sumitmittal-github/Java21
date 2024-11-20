package com.sumit.java8.k_io;

import java.io.*;

public class IO2_Binary {

    public static void main(String[] args) throws Exception {

        System.out.println("Current working directory is : ");
        System.out.println(System.getProperty("user.dir"));

        //readCharByChar();
        readLineByLine();
    }

    public static void readCharByChar() throws Exception {
        try(FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\etumsmi\\projects\\source.class"));
            FileOutputStream outputStream = new FileOutputStream(new File("C:\\Users\\etumsmi\\projects\\target.class")))
        {
            int charr;          // ASCII value of individual char
            while((charr = inputStream.read()) != -1){
                outputStream.write(charr);

                //System.out.println(Character.toString ((char) charr));      //printing char by char
            }
        }
    }

    public static void readLineByLine() throws Exception {
        try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(new File("C:\\Users\\etumsmi\\projects\\source.class")));
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(new File("C:\\Users\\etumsmi\\projects\\target.class"))))
        {
            byte[] line = new byte[1024];
            int numOfBytes = 0;
            while((numOfBytes = inputStream.read(line)) != -1){
                outputStream.write(line, 0, numOfBytes);

                //System.out.println(line);     //printing line by line
            }
        }
    }

}
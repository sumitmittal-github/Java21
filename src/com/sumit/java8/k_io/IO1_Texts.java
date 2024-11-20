package com.sumit.java8.k_io;

import java.io.*;

public class IO1_Texts {

    public static void main(String[] args) throws Exception {
        //readCharByChar();
        readLineByLine();
    }
    
    public static void readCharByChar() throws Exception {
        try(FileReader reader = new FileReader(new File("C:\\Users\\etumsmi\\projects\\source.txt"));
            FileWriter writer = new FileWriter(new File("C:\\Users\\etumsmi\\projects\\target.txt")))
        {
            int charr;          // ASCII value of individual char
            while((charr = reader.read()) != -1){
                writer.write(charr);

                //System.out.print(Character.toString ((char) charr));      printing char by char
            }
        }
    }

    public static void readLineByLine() throws Exception {
        try(BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\etumsmi\\projects\\source.txt")));
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("C:\\Users\\etumsmi\\projects\\target.txt"))))
        {
            String line;          // ASCII value of individual char
            while((line = reader.readLine()) != null){
                writer.write(line);

                //System.out.println(line);     printing line by line
            }
        }
    }

}
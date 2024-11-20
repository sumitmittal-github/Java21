package com.sumit.java8.l_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO1_Path {

    public static void main(String[] args) {

        // Java-11 style
        Path p1 = Path.of("abc/def/xyz.png");
        Path p2 = Path.of("c:\\abc\\def\\xyz.png");

        // using varargs
        Path p3 = Path.of("abc", "def", "xyz.png");
        Path p4 = Path.of("c:", "abc", "def", "xyz.png");




        // old style (not recommended)
        Path p5 = Paths.get("abc/def/xyz.png");
        Path p6 = Paths.get("c:\\abc\\def\\xyz.png");

        // using varargs
        Path p7 = Paths.get("abc", "def", "xyz.png");
        Path p8 = Paths.get("c:", "abc", "def", "xyz.png");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p7);
        System.out.println(p8);


    }

}
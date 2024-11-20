package com.sumit.java8.l_nio;

import java.nio.file.Path;

public class NIO2_Path_Methods {

    public static void main(String[] args) {

        Path path = Path.of("abc/def/xyz.png");

        System.out.println(path.getNameCount());

        for(int i=0; i<path.getNameCount(); i++)
            System.out.println("path.getName("+i+") = " + path.getName(i));

        System.out.println(path.getFileName());

        System.out.println(path.getParent());

        System.out.println(path.getRoot());

        System.out.println(path.subpath(0, 2));

        System.out.println(path.isAbsolute());


    }

}
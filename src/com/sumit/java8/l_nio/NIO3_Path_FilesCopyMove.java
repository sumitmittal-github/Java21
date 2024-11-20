package com.sumit.java8.l_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class NIO3_Path_FilesCopyMove {

    public static void main(String[] args) throws Exception {

        Path sourcePath  = Path.of("C:\\Users\\etumsmi\\projects\\source.txt");
        Path targetPath  = Path.of("C:\\Users\\etumsmi\\projects\\target.txt");
        Path targetPath2 = Path.of("C:\\Users\\etumsmi\\projects\\target2.txt");


        // create all these directories if does not exists
        Files.createDirectories(Path.of("C:\\Users\\etumsmi\\projects"));


        if(!Files.exists(sourcePath)) {
            Files.createFile(sourcePath);           // create entry source file
            Files.copy(sourcePath, targetPath);     // copy source into target (if target does not exists then create first)
            Files.move(targetPath, targetPath2);    // move target1 -> target2
            Files.delete(targetPath2);              // delete target2
        }
        else {
            Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);    // 3rd argument to avoid FileAlreadyExistsException if target.txt already exists
            Files.move(targetPath, targetPath2, StandardCopyOption.REPLACE_EXISTING);   // 3rd argument to avoid FileAlreadyExistsException if target2.txt already exists
        }
    }

}
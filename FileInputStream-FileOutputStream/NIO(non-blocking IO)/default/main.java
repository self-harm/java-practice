package com.javarush.task.task31.task3103;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/* 
Своя реализация
*/

public class Solution {

     public static byte[] readBytes(String fileName) throws IOException {
        Path path = Paths.get(fileName);// create path

        return Files.readAllBytes(path); /*byte[] fileArray = Files.readAllBytes(path);
                                           return fileArray;
                                           */
    }

    public static List<String> readLines(String fileName) throws IOException {
        return null;
    }

    public static void writeBytes(String fileName, byte[] bytes) throws IOException {
    }

    public static void copy(String resourceFileName, String destinationFileName) throws IOException {

    }
}

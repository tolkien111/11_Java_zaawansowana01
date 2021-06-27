package com.sda.io.sda.zadanie1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilesApp {

    public static void main(String[] args) {

        Path path = Paths.get("C:\\Gry\\The Witcher 3 Wild Hunt GOTY");
        String [] fileList = path.toFile().list();
        System.out.println(Arrays.toString(fileList));

        System.out.println();

        File file = new File("C:\\Gry\\The Witcher 3 Wild Hunt GOTY");
        String [] fileList2 = file.list();
        System.out.println(Arrays.toString(fileList2));

        System.out.println();

        try {
            Predicate<Path> pathPredicate = path1 -> Files.isRegularFile(path1);
            Consumer <Path> pathConsumer = path1 -> System.out.println("File: " + path1);
            Files.list(path)
                    .filter(pathPredicate)
                    .forEach(pathConsumer);

        } catch (IOException ioException){
            System.out.println("Wystąpił błąd");
            ioException.printStackTrace();
        }
    }
}

package com.sda.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//ZADANIE 1 w JAVA_ZAAW_4_IO

public class OperationsApp {
    public static void main(String[] args) {
        //relatywna ścieżka - od folderu głównego
        Path relativePath = Paths.get("input.txt");
        System.out.println(relativePath + " istnieje: " + Files.exists(relativePath));
        System.out.println("1\n");

        //absolutna ściażka
        //prawy przycisk na plik i copy Path
        Path absolutPath = Paths.get("C:\\Users\\kamil\\IdeaProjects\\Java_zaawansowana\\Java zaawansowana_01\\input.txt");
        System.out.println(absolutPath + " is a file: " + Files.isRegularFile(absolutPath));
        System.out.println("2\n");

        //podaje ścieżke folderu  i dokleja ścieżkę pliku/plik do niej
        Path projectRootDirectory = Paths.get("C:\\Users\\kamil\\IdeaProjects\\Java_zaawansowana\\Java zaawansowana_01");
        Path inputPath = projectRootDirectory.resolve("input.txt");
        System.out.println(inputPath);
        System.out.println("3\n");

        // inna metoda na podania ścieżki i sprawdzenie czy jest zapisywalny
        Path path = Paths.get("C", "Windows", "system.ini");
        System.out.println("Zapis do pliku " + path + ": " + Files.isWritable(path));
        System.out.println("4\n");

        //wyświetlanie plików jakie mamy w folderze
        Path dyskC = Paths.get("C:\\Users\\kamil\\IdeaProjects\\Java_zaawansowana\\Java zaawansowana_01");

        try {
            Predicate<Path> isFile = anyPath -> Files.isRegularFile(anyPath);
            Set<Path> pathSet = Files.list(dyskC).collect(Collectors.toSet());
            System.out.println(pathSet.toString());
        } catch (IOException exception) {
            System.out.println("Wystąpił błąd: " + exception.toString());
        } finally {
            System.out.println("sprzątam");
        }

        //użycie STREAM - wyświetlenie plików w folderze
        try {
            Predicate <Path> isFile01 = anyPath01 -> Files.isRegularFile(anyPath01);
            Consumer<Path> printPath = anyPath -> System.out.println("Plik " + anyPath);
            Files.list(projectRootDirectory)
                    .filter(isFile01)
                    .forEach(printPath);
        } catch (IOException exception) {
            System.out.println("Wystąpił błąd: " + exception.toString());
        } finally {
            System.out.println("sprzątam");
        }
    }
}

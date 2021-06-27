package com.sda.io.sda.zadanie2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadFileApp {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\kamil\\Desktop\\Programowanie\\Lekcje\\Lekcja 14 - Programowanie zaawansowane");
        Path absolutePath = path.resolve("Lekcja 14.txt");

        Path path2 = Paths.get("C:\\Users\\kamil\\Desktop\\Programowanie\\Lekcje\\Lekcja 14 - Programowanie zaawansowane\\Lekcja 14.txt");

        //try with resources
        try (FileReader fileReader = new FileReader("C:\\Users\\kamil\\Desktop\\Programowanie\\Lekcje\\Lekcja 14 - Programowanie zaawansowane\\Lekcja 14.txt");
             BufferedReader bufferedReader = Files.newBufferedReader(path2)) {
            String oneLine = bufferedReader.readLine();
            while (oneLine != null) {
                System.out.println(oneLine);

                oneLine = bufferedReader.readLine();
            }
        } catch (IOException ioException) {
            System.out.println("błąd odczytu pliku \n");
            ioException.printStackTrace();
        }

        System.out.println("-------------------------------------------");

        //try-catch
        BufferedReader bufferedReader;
        String oneLine;
        try {
            FileReader fileReader = new FileReader
                    (String.valueOf(absolutePath));
            bufferedReader = new BufferedReader(fileReader);
            while ((oneLine = bufferedReader.readLine()) != null) {
                System.out.println(oneLine);
            }
            bufferedReader.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Plik nie został znaleziony \n");
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            System.out.println("błąd odczytu pliku \n");
            ioException.printStackTrace();
        } finally {
            System.out.println("READ END : plik zamknięty w bloku try");
        }
    }
}

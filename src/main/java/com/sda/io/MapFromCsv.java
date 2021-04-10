package com.sda.io;
/*
Napisz klasę MapFromCsv która wczyta mapę
zawierającą stringi z pliku csv
(linia po linii wartości przedzielane przecinkami).
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class MapFromCsv {
    public static void main(String[] args) {
        Path path = Paths.get("mapa.csv");

        Map<String, String> loaded = readFromFile(path);

        System.out.println(loaded);
    }

    private static Map<String, String> readFromFile(Path path) {
        Map<String, String> loadedData = new HashMap<>();

//try-with-resources
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {//jeżeli cokolwiek się stanie tutaj to java zwolni nam plik -> nie potrzeba finally aby czyścić
                                                                             // trzeba zamykać/czyścić po sobie jak pracujemy na plikach -> try with resources czyli linia ->
            String line = bufferedReader.readLine();                         // -> try (BufferedReader bufferedReader = Files.newBufferedReader(path))
            while (line != null) {                                           // try with resources - automatyczne sprzątanie
                String[] values = line.split(",");

                if (values.length != 2) {
                    throw new RuntimeException(" nieprawidłowa lini: " + line);
                }
                String name = values[0].trim();
                String surname = values[1].trim();
                loadedData.put(name, surname);

                line = bufferedReader.readLine();
            }
        } catch (IOException exception) {
            System.out.println("Wystąpił błąd: " + exception.getMessage());
        }
        return loadedData;
    }
}

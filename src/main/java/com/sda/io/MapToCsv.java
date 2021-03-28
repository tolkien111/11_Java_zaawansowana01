package com.sda.io;
/*
Napisz klasę MapToCsv która zapisze mapę zawierającą stringi
do pliku csv (linia po linii wartości przedzielane przecinkami)
 */


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class MapToCsv {
    public static void main(String[] args) {
        Map<String, String> values = new HashMap<>();
        values.put("Karol", "Koltun");
        values.put("Michael", "Jordan");
        values.put("Jarosław", "Kaczyński");

        Path path = Paths.get("mapa.csv");

        writeToFileAnotherMethod(path, values);

    }

    private static void writeToFile(Path path, Map<String, String> values) {
        try {                                                   //łapiemy błąd
            BufferedWriter bufferedWriter = Files.newBufferedWriter(path);

            for (String name : values.keySet()) {
                String surname = values.get(name);
                bufferedWriter.write(name + ", " + surname);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException ioException) {
            System.out.println("Wystąpił błąd: " + ioException);
        }
    }

    private static void writeToFileAnotherMethod(Path path, Map<String, String> values) {
        StringBuilder dane = new StringBuilder();
        for (String name : values.keySet()) {
            String surname = values.get(name);

            dane.append(name).append(", ").append(surname).append("\n"); // użyty StringBuilder -> nie sklejamy przez Stringa przez +
        }
        try {
            Files.writeString(path, dane.toString());
        } catch (IOException ioException) {
            System.out.println("Wystąpił błąd: " + ioException);
        }
    }
}

package com.sda.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//ZADANIE 5.1 w JAVA_ZAAW_4_IO, bez 3a i 3b, używamy naszego pliku z OperationsApp
public class ReadingApp {
    //efektywna metoda odczytu z pliku BufferedReader -> tutaj linia po lini
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("input.txt");

        Reader reader = new FileReader(path.toFile());
        BufferedReader bufferedReader = new BufferedReader(reader);

        //Alternatywne tworzenie BufferedReadera
        BufferedReader otherBufferedReader = Files.newBufferedReader(path);

        String line = bufferedReader.readLine();
        while (line != null){
            System.out.println(line);

            line = bufferedReader.readLine();
        }
    }


    //najbardziej prymitywna forma odczytu z pliku -> znak po znaku - nie używamy
    private static void readFileWithRawRader() throws Exception {
        Path path = Paths.get("input.txt");

        Reader reader = new FileReader(path.toFile());

        int number = reader.read();
        while (number != -1) {
            char character = (char) number;
            System.out.println(character);
            number = reader.read();
        }
    }

}

package com.sda.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WritingApp {
    public static void main(String[] args) throws Exception { // nie łapiemy błędu

        //zapisywanie do pliku -> BufferedWriter
        Path path = Paths.get("input.txt");
        Writer writer = new FileWriter(path.toFile(), true); // append świadczy o tym że nadpisuje plik o nowe dane nie zastępując ich
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("Nowy tekst");
        bufferedWriter.newLine();
        bufferedWriter.write("Dodatkowy plik");
        bufferedWriter.newLine();
        bufferedWriter.close(); // musimy zamknąć plik żeby BufferWriter zapisał do pliku dane które wprowadziliśmy

    }
}

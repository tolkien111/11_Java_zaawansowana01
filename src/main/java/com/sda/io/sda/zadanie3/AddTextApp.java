package com.sda.io.sda.zadanie3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AddTextApp {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        String strLine = "";
        //tworzenie pliku
//        Path path;
//        Path fileName;
//        try {
//            path = Paths.get("C:\\Users\\kamil\\IdeaProjects\\Java_zaawansowana\\11_Java_zaawansowana01");
//            fileName = path.resolve("input2.txt");
//            Files.createFile(fileName);
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        }

        try {
            FileWriter writer = new FileWriter("input2.txt", true);
            writer.write("ala ma kota\n");
            writer.close();

            FileReader fileReader = new FileReader("input2.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (strLine != null) {
                stringBuilder.append(strLine);
                stringBuilder.append(System.lineSeparator());
                strLine = bufferedReader.readLine();
                System.out.println(strLine);
            }
            bufferedReader.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}

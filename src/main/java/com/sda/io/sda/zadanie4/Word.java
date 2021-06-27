package com.sda.io.sda.zadanie4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Word {

    public String findTheLongestWord(File file) throws FileNotFoundException {
        String longestWord = "";
        String tempWord;
        Scanner scanner = new Scanner(new File(String.valueOf(file)));
            while (scanner.hasNext()) {
                tempWord = scanner.next();
                if (tempWord.length() > longestWord.length()) {
                    longestWord = tempWord;
                }
            }
        return longestWord;
        }

    }

package com.sda.io.sda.zadanie4;

import java.io.File;
import java.io.FileNotFoundException;

public class WordApp {
    public static void main(String[] args) throws FileNotFoundException {
        Word word = new Word();
        System.out.println(word.findTheLongestWord(new File("C:\\Users\\kamil\\IdeaProjects\\Java_zaawansowana\\11_Java_zaawansowana01\\input.txt")));

    }
}

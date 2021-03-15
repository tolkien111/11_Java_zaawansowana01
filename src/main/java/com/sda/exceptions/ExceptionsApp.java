package com.sda.exceptions;

import java.util.Locale;
//Zadanie 1/str.6 - ZAAW2

public class ExceptionsApp {
    public static void main(String[] args) {
        String text = null;
        try {
            System.out.println(text.toUpperCase());
        } catch (Exception exception) { //zamiast Exception może być NullPointerException
            System.out.println("Wystąpił wyjątek " + exception.getMessage());
        } finally {
            System.out.println("Czyszczę po sobie");
        }
    }
}

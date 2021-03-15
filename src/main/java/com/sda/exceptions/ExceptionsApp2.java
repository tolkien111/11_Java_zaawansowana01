package com.sda.exceptions;

//Zadanie3/str20 - ZAAW2

import java.util.Scanner;
//Unchecked exception:

public class ExceptionsApp2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String name = sc.nextLine();

            greet(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Wystąpił wyjątek: " + illegalArgumentException);
        }

        System.out.println("Zamykam program");
    }

    static void greet(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Nie wprowadzono imienia");
        }
        System.out.println("Hello " + name);
        if (name.length() == 1) {
            throw new IllegalArgumentException("Imię jest zbyt krótkie");
        }
    }
}

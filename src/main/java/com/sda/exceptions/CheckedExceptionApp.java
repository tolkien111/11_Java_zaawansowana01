package com.sda.exceptions;
import java.util.Scanner;

//Checked exception:

public class CheckedExceptionApp {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String input = scanner.nextLine();
            greet(input);
        } catch (Exception exception) {
            System.out.println("Wystąpił błąd " + exception.getMessage());
        }
        System.out.println("Zamykam program.");
    }
    static void greet(String name) throws Exception { // throws oznaczenie metody rzucającej wyjątek (opowiązkowe do checked exception
                                                      // nieobowiązkowe dla unchecked exception
        if (name == null || name.isEmpty()) {
            throw new Exception("Imię jest puste");
        }
        if (name.length() == 1) {
            throw new Exception("Imię jest zbyt krótkie");
        }
        System.out.println("Hello " + name);
    }
}
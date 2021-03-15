package com.sda.exceptions;

public class MyExceptionApp {

    public static void main(String[] args) {
        try {
            MyExceptionApp.greet("");
        } catch (InvalidNameException invalidNameException) {
            System.out.println("Błąd w imieniu " + invalidNameException.getMessage());
        }
    }


    static void greet(String name) throws InvalidNameException {
        if (name == null || name.isEmpty()) {
            throw new InvalidNameException("Imię jest puste");
        }
        if (name.length() == 1) {
            throw new InvalidNameException("Imię jest za krótkie");
        }
        System.out.println("Hello " + name);
    }
}

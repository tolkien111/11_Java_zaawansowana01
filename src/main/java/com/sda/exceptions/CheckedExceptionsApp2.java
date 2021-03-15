package com.sda.exceptions;

import java.util.Scanner;

//Checked exception:

public class CheckedExceptionsApp2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String input = scanner.nextLine();
            greet(input);
        } catch (Exception exception) {
            System.out.println("Wystąpił błąd: " + exception.getMessage());
        }
        System.out.println("Zamykam program.");
    }

    //Checked Exception bez łapania go
    static void greet(String name) throws Exception { //oznaczenie metody jako rzucającej wyjątek(obowiązkowe dla checked exception,dla unchecked
        //opcjonalne
        if (name == null || name.isEmpty()) {
            throw new Exception("Imię jest puste");
        }
        if (name.length() == 1) {
            throw new Exception("Imię jest zbyt krótkie");
        }
        System.out.println("Hello " + name);
    }

//     //Checked Exception
//    static void greet(String name) {
//        try {
//            if (name == null || name.isEmpty()) {
//                throw new Exception("Imię jest puste");
//            }
//            if (name.length() == 1) {
//                throw new Exception("Imię jest zbyt krótkie");
//            }
//            System.out.println("Hello " + name);
//        }catch(Exception exception1){
//            System.out.println("Błąd");
//        }
//    }

}
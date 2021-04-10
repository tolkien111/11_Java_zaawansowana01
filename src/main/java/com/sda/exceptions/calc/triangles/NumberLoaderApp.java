package com.sda.exceptions.calc.triangles;

public class NumberLoaderApp {
    public static void main(String[] args) {

        try {
            int number = NumberLoader.loadFromUser();
        } catch (InvalidInputException invalidInputException) { //łapiemy nasz błąd rzucony w w NumberLoader
            System.out.println("Niewałaściwy format wprowadzonych danych");
        }
    }
}

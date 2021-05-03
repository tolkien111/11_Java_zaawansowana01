package com.sda.kolekcje.zadania.zadanie3;

public class ListOfNumbersApp {
    public static void main(String[] args) {

        ListOfNumbers list = new ListOfNumbers();

        System.out.println(list.fillListOfNumbers(10, 20));

        System.out.println(list.findDuplicatedNumbers());
        System.out.println(list.findUniqueNumbers());



    }
}

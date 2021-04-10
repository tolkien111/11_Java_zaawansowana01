package com.sda.exceptions.calc.triangles;
//Zadanie 1.3 Powtórka

//W paczce com.sda.calc.triangles stwórz nową klasę wyjątku InvalidInputException. Na razie pozostaw klasę pustą.
//W paczce com.sda.calc.triangles stwórz nową klasę NumberLoader.
//Klasa niech ma pojedynczą, statyczną metodę int loadFromUser().
//Wewnątrz metody, pobierz liczbę od użytkownika i ją zwróć.
//Jeśli użytkownik poda tekst, który nie jest liczbą, wyrzuć wyjątek InvalidInputException.
//Zadbaj o to, by obiekt stworzonego wyjątku przechowywał tekst otrzymany od użytkownika długości boków oraz odpowiednią wiadomość podsumowującą błąd (dostępną pod metodą getMessage).
//Stwórz nową klasę NumberLoaderApp, metodę main i wypróbuj ładowanie liczb. W razie błędu, złap wyjątek i wyświetl odpowiednią wiadomość.


import java.util.Scanner;

public class NumberLoader {

    public static int loadFromUser() throws InvalidInputException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj liczbę");
            String text = sc.nextLine();
            int number = Integer.parseInt(text); //zamiana String na Integer
            return number;
        } catch (NumberFormatException numberFormatException) { //przekształcanie NumberFormatException na nasz błąd -> InvalidInputException
            throw new InvalidInputException(); //rzucamy naszym błędem
        }
    }
}

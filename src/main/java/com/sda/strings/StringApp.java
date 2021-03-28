package com.sda.strings;

import java.util.ArrayList;
import java.util.List;

//Zadanie 2.1 OPP - paczka z zadaniami na stronie Karola

public class StringApp {
    public static void main(String[] args) {

        List<String> listStrings = new ArrayList<>();
        listStrings.add("Tekst przykładowy 1");
        listStrings.add("Tekst przykładowy 2");
        listStrings.add("Tekst przykładowy 3");


//Implementacja interface poprzez stworzenie nowej klasy
        TextToUpperCase textToUpperCase = new TextToUpperCase();

        for (String text : listStrings) {
            String upperCase = textToUpperCase.modify(text);
            System.out.println(upperCase);
        }
        System.out.println("1\n");


//Implementacja inteface przez klasę anonimową
        StringOperation textDuplicate = new StringOperation() {
            @Override
            public String modify(String text) {
                return text.concat(text); // ew. text + text
            }
        };

        for (String text : listStrings) {
            String duplicate = textDuplicate.modify(text);
            System.out.println(duplicate);
        }
        System.out.println("2\n");


//LAMBDA - inna implementacja interface, krótsza i nowoczesna, ale nie najkrótsza ->napisana wprost
// w interface musi być tylko jedna niezaimplementowana metoda aby za pomocą stream zaimplementować interface (Functional Interface)
        StringOperation removeLetterI = (String text) -> {
            return text.replace("a", "");
        };

        for (String text : listStrings) {
            String remove = removeLetterI.modify(text);
            System.out.println(remove);
        }
        System.out.println("3\n");


//Skrócenie stringa do 3 liter za pomocą LAMBDA - najkrótsza forma
        StringOperation shortText = text -> text.substring(0, 3);

        for (String text : listStrings) {
            String remove = shortText.modify(text);
            System.out.println(remove);
        }
        System.out.println("4\n");


//doklejamy tekst HELLO za pomocą LAMBDA i używamy naszej metody modyfikującej -> intelliJ podpowiada żeby użyć referencji do metody
        StringOperation addHello = text -> addHello(text);

        for (String text : listStrings) {
            String textWithHello = addHello(text);
            System.out.println(textWithHello);
        }
        System.out.println("4\n");


//Implementacja interface za pomocą REFERENCJI DO METODY (charakterystyczne "::")
        StringOperation textToUpperCaseMethodReferance = String::toUpperCase;

    // implementujemy interface i dodatkowo używamy naszej metody modyfikującej - typ danych wejściowych i wyjściowych musi się zgadzać
    // w interface i naszej metodzie modyfikującej
        StringOperation addHelloToText = StringApp::addHello;

        for (String text : listStrings) {
            String toUpperCase = textToUpperCaseMethodReferance.modify(text);
            String addHelloWithReferance = addHelloToText.modify(text);
            System.out.println(toUpperCase);
            System.out.println(addHelloWithReferance);
        }
        System.out.println("6\n");
    }

//Nasz metoda modyfikująca string
    public static String addHello(String text) {
        return "HELLO " + text;
    }
}

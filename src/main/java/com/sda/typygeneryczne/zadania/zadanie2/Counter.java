package com.sda.typygeneryczne.zadania.zadanie2;

public class Counter {

    public static <T> int countIf(T[] table, Validator<T> validator) {

        int counter = 0;
        for (T element : table) {
            if (validator.validated(element)) {
                counter++;
            }
        }
        return counter;
    }
}

package com.sda.typygeneryczne.zadania.zadanie3;

import java.util.Arrays;

public class SwapApp {

    public static void main(String[] args) {


        //metoda niestatyczna
        String[] array = {"Michael", "Jordan", "Rambo", "Terminator", "Hobbit"};
        System.out.println(Arrays.toString(array));
        Swap swap = new Swap();
        swap.swap1(array, 1, 3);
        System.out.println(Arrays.toString(array));
        System.out.println();

        //metoda statyczna
        String[] array2 = {"Michael", "Jordan", "Rambo", "Terminator", "Hobbit"};
        System.out.println(Arrays.toString(array2));
        Swap.swap2(array2, 2, 4);
        System.out.println(Arrays.toString(array2));
    }
}

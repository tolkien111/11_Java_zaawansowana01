package com.sda.generic;

public class GenericToolsApp {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 44, 6, 44};
        findDuplicates(numbers);
    }

    // [publiczna] [statyczna] [generyczna] [nie zwracająca nic] metoda o nazwie print przyjmujaca argument
    public static <T> void print(T item) {
        System.out.println(item.toString());
        System.out.println(item.getClass());
    }

    public static <T> void findDuplicates(T[] arrayT) {
        for (int i = 0; i < arrayT.length; i++) {
            for (int j = i + 1; j < arrayT.length; j++) {
                if (arrayT[i].equals(arrayT[j])) {
                    System.out.println("Found duplicated number: " + arrayT[i]);
                    return;                 //kończy pracę przy pierszej powtórce
                }
            }
        }
        System.out.println("Not found"); // jeżeli nie znajdzie powtórki to wyświetli ten tekst
    }
}

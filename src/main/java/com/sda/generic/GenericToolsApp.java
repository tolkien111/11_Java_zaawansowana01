package com.sda.generic;

public class GenericToolsApp {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 5, 6, 5};
        findDuplicates(numbers);
    }

    // [publiczna] [statyczna] [generyczna] [nie zwracająca nic] metoda o nazwie print przyjmujaca argument
    public static <T> void print(T item) {
        System.out.println(item.toString());
        System.out.println(item.getClass());
    }

    public static <T> void findDuplicates(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println("Found " + array[i]);
                    return;
                }
            }
        }
        System.out.println("Not found");
    }
}

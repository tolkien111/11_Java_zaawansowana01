package com.sda.typygeneryczne.zadania.zadanie2;
//strona 20/27

public class CounterApp {

    public static void main(String[] args) {

        Integer[] table = {12, 9, 432, 11, 24, 66};
        int count = Counter.countIf(table, new Validator<Integer>() {
            @Override
            public boolean validated(Integer value) {
                return value % 2 == 0;
            }
        });
        System.out.println(count);

        String[] table2 = {"Rak", "Mak", "Owoc", "Robak", "Bocian", "Rekin"};
        int count2 = Counter.countIf(table2, new Validator<String>() {
            @Override
            public boolean validated(String value) {
                return value.length() > 4;
            }
        });
        System.out.println(count2);
    }

    // JAK ROZWIĄZAC Z LAMBDĄ??
}

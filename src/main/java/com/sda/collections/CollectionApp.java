package com.sda.collections;

import java.util.*;

public class CollectionApp {
    public static void main(String[] args) {
        // Lista
        List<String> list = new ArrayList<>();
        list.add("Karol");
        list.add("Wiktoria");
        list.add("Wiktoria");
        list.add("Marek");
        for (String imie : list) {
            System.out.println(imie);
        }

        // Set
        Set<String> texts = new HashSet<>();
        texts.add("First");
        texts.add("Second");
        texts.add("Third");
        texts.add("Third");
        for (String text : texts) {
            System.out.println(text);
        }

        System.out.println(texts);

        // Map
        Map<String, String> people = new HashMap<>();
        people.put("Karol", "programista");
        people.put("Ola", "socjolożka");
        people.put("Józef", "kierowca");

        // Iterowanie po kluczach
        for (String name : people.keySet()) {
            System.out.println(name);
            System.out.println("Praca " + name + " to jest " + people.get(name));
        }
        // Iterowanie po wartościach
        for (String job : people.values()) {
            System.out.println(job);
        }
        // Iterowanie po parach
        for (Map.Entry<String, String> pair : people.entrySet()) {
            System.out.println("Imię " + pair.getKey() + "; zawód " + pair.getValue());
        }

        String pracaOli = people.get("Ola");
        System.out.println(pracaOli);

        System.out.println(people);
    }
}

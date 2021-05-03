package com.sda.kolekcje.zadania.zadanie3;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfNumbers {

    Random random = new Random();
    List<Integer> listOfNumbers = new ArrayList<>();
    Set<Integer> uniqueValuesFromTheList = new HashSet<>();
    Set<Integer> duplicatedValueFromTheList = new HashSet<>();

    public List<Integer> fillListOfNumbers(int maxValue, int sizeOfList) {
        Supplier<Integer> supplier = () -> random.nextInt(maxValue);
        listOfNumbers = Stream
                .generate(supplier)
                .limit(sizeOfList)
                .collect(Collectors.toList());

        return listOfNumbers;
    }

    public Set<Integer> findDuplicatedNumbers() {
        Set<Integer> tempSet = new HashSet<>();
        for (Integer value : listOfNumbers) {
            if (!tempSet.add(value)) {
                duplicatedValueFromTheList.add(value);
            }
        }
        return duplicatedValueFromTheList;
    }

    public Set<Integer> findUniqueNumbers() {
        List<Integer> withoutDuplicates = listOfNumbers.stream().distinct().collect(Collectors.toList());

        for (Integer value : withoutDuplicates) {
            int i = 0;
            for (Integer value1 : listOfNumbers) {
                if (value.equals(value1)) {
                    i++;
                }
            }
            if (i == 1) {
                uniqueValuesFromTheList.add(value);
            }
        }
        return uniqueValuesFromTheList;
    }
}

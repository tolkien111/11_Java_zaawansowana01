package com.sda.typygeneryczne.zadania.zadanie3;

public class Swap {

    //statycznie
    public <T> void swap1 (T[] array, int firstIndex, int secondIndex){
        T temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
    //niestatycznie
    public static <T> void swap2 (T[] array, int firstIndex, int secondIndex){
        T temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}

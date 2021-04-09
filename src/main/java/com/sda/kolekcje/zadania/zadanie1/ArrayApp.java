package com.sda.kolekcje.zadania.zadanie1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayApp {
    public static void main(String[] args) {


        SDAArrayList<String> aoa = new SDAArrayList<>();

        aoa.add("Tomasz");
        aoa.display();
        System.out.println("1");
        aoa.add("Antoni");
        aoa.add("Mieszko");
        System.out.println(aoa.get(2));
        System.out.println("2");
        aoa.display();
        System.out.println("3");
        aoa.remove(0);
        aoa.remove(0);
        aoa.display();
        ;

    }


}

class SDAArrayList<T> {
    private static final int START_CAPACITY = 1;
    private Object[] arrayElement;
    private int size = 0;


    public SDAArrayList() {
        arrayElement = new Object[START_CAPACITY];
    }

    public void add(T t) {
        if (size == arrayElement.length) {
            increaseArrayElement();
        }
        arrayElement[size++] = t;
    }

    public void remove(int removeIndex) {
        if (size < 0 || removeIndex >= size) {
            throw new IndexOutOfBoundsException("Index out of bound exception. Please insert correct index");
        }
        for (int i = removeIndex; i < size - 1; i++) {
            arrayElement[i] = arrayElement[i + 1];
        }
        size--;
        decreaseArraySize();
    }

    public T get(int getIndex) {
        if (getIndex < 0 || getIndex > size - 1) {
            throw new IndexOutOfBoundsException("Index out of bound exception. Please insert correct index");
        }
        return (T) arrayElement[getIndex];
    }

    public void display() {
        for (Object element : arrayElement) {
            System.out.println(element);
        }
    }


    private void increaseArrayElement() {
        arrayElement = Arrays.copyOf(arrayElement, arrayElement.length + 1);
    }


    private void decreaseArraySize() {
        arrayElement = Arrays.copyOf(arrayElement, arrayElement.length - 1);

    }


    @Override
    public String toString() {
        return "SDAArrayList{" +
                "arrayElement=" + Arrays.toString(arrayElement) +
                ", size=" + size +
                '}';
    }
}

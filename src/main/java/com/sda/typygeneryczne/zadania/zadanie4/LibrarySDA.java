package com.sda.typygeneryczne.zadania.zadanie4;

public class LibrarySDA <T extends ObjectCreator> {

    private T[] elements;

    public T[] getElements() {
        return elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }

    public LibrarySDA(T[] elements) {
        this.elements = elements;


    }
}

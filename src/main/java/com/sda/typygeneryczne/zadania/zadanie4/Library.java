package com.sda.typygeneryczne.zadania.zadanie4;

import java.util.List;

public class Library <T extends ObjectCreator> {
    private List <T> list;

    public Library(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Library{" +
                "list=" + list +
                '}';
    }
}

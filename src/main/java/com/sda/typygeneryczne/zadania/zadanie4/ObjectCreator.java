package com.sda.typygeneryczne.zadania.zadanie4;

public abstract class ObjectCreator {
    protected String title;

    public ObjectCreator(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ObjectCreator{" +
                "title='" + title + '\'' +
                '}';
    }
}

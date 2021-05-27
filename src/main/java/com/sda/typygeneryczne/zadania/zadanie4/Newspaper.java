package com.sda.typygeneryczne.zadania.zadanie4;

public class Newspaper extends ObjectCreator {
    private String editor;

    public Newspaper(String title, String editor) {
        super(title);
        this.editor = editor;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "editor='" + editor + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

package com.sda.diary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Diary {
    private List<Entry> entries = new ArrayList<>();

    public List<Entry> getEntries() {
        return entries;
    }

    private class Entry {
        LocalDate date;
        String text;
    }

    public void writeEntry(String text) {
        Entry entry = new Entry();
        entry.text = text;
        entry.date = LocalDate.now();
        entries.add(entry);
    }

    public List<String> getEntriesFrom(LocalDate date) {
        List<String> dziennik = new ArrayList<>();
        for (Entry page : entries) {
            if (date.isEqual(page.date)) {
                dziennik.add(page.text);
            }
        }
        return dziennik;
    }

    @Override
    public String toString() {
        return "Diary{" +
                "entries=" + entries +
                '}';
    }
}


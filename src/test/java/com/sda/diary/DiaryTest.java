package com.sda.diary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
class DiaryTest {
    @Test
    void firstTest() {
        Diary diary = new Diary();
        diary.writeEntry("Wpis1");
        diary.writeEntry("Wpis2");
        System.out.println(diary.getEntries().get(0));
        int c = diary.getEntries().size();
        assertEquals(2, c);
    }

    @Test
    void secondTets() {
        Diary diary = new Diary();
        diary.writeEntry("Witaj jozefie");
        diary.writeEntry("Witaj jozefie2");
        diary.writeEntry("Witaj jozefie3");
        int b = diary.getEntriesFrom(LocalDate.of(2021, 3, 16)).size();
        System.out.println(b);
        Assertions.assertEquals(3, b);
    }
}
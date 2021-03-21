package com.sda.diary;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
class DiaryTest {
    @Test
    void firstTest() {
        //Given
        Diary diary = new Diary();
        //Wenn
        diary.writeEntry("Wpis1");
        diary.writeEntry("Wpis2");
        //Then
        int c = diary.getEntries().size();
        assertEquals(2, c);
    }

    @Test
    void secondTets() {
        //Given
        Diary diary = new Diary();
        //Wenn
        diary.writeEntry("Witaj jozefie");
        diary.writeEntry("Witaj jozefie2");
        //Then
        List<String> result = diary.getEntriesFrom(LocalDate.now());
        List<String> shouldBe = new ArrayList<>();
        shouldBe.add("Witaj jozefie");
        shouldBe.add("Witaj jozefie2");
        int sizeList = diary.getEntriesFrom(LocalDate.now()).size();

        assertThat(result)
                .isEqualTo(shouldBe);
        assertThat(sizeList)
                .isEqualTo(2);
    }
}
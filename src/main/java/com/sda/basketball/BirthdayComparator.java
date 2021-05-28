package com.sda.basketball;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BirthdayComparator implements Comparator <Player> {


    @Override
    public int compare(Player player01, Player player02) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthdayPlayer01 = LocalDate.parse(player01.getDateOfBirth(), formatter);
        LocalDate birthdayPlayer02 = LocalDate.parse(player02.getDateOfBirth(), formatter);
        return birthdayPlayer01.compareTo(birthdayPlayer02);
    }
}

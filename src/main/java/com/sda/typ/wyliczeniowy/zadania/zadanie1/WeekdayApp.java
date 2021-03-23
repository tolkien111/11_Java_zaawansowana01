package com.sda.typ.wyliczeniowy.zadania.zadanie1;

public class WeekdayApp {
    public static void main(String[] args) {

        Weekday firstDay = Weekday.MONDAY;
        Weekday secondDay = Weekday.THURSDAY;
        Weekday thirdDay = Weekday.THURSDAY;
        Weekday fourthDay = Weekday.SATURDAY;

        firstDay.inHoliday();
        fourthDay.inHoliday();
        secondDay.inWeekDay();
        fourthDay.inWeekDay();

        firstDay.whichIsGreater(thirdDay);
        secondDay.whichIsGreater(thirdDay);
        fourthDay.whichIsGreater(secondDay);

        /*
        Zadanie1 jest kiepsko opisane. Chcą aby użyć compareTo a
        w odpowiedziach jest metoda ordinal().
        Po za tym nie sprawdzają przypadku gdy dni są sobie równe.
        Druga sprawa -> metodą boolean inHoliday i inWeekDay
        po co mamy tylko zwracać true albo false skoro później nie możemy tego
        wykorzystać w klasie main.
         */

    }
}

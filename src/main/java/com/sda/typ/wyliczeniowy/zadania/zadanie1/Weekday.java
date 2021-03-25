package com.sda.typ.wyliczeniowy.zadania.zadanie1;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    public boolean inHoliday() {
        if (this == SATURDAY || this == SUNDAY) {
            System.out.println(this + " is a holiday");
            return true;
        } else {
            System.out.println(this + " isn't a holiday");
            return false;
        }
    }

    public boolean inWeekDay() {
        if (this != SATURDAY && this != SUNDAY) {
            System.out.println(this + " is a week day");
            return true;
        } else {
            System.out.println(this + " isn't a week day");
            return false;
        }
    }

    public void whichIsGreater(Weekday weekday) {
        if (this.compareTo(weekday) < 0) {
            System.out.println(this +
                    " is before " + weekday);
        } else if (this.compareTo(weekday) > 0) {
            System.out.println(this +
                    " is after " + weekday);
        } else if (this.compareTo(weekday) == 0)
            System.out.println(this +
                    " and " + weekday + " are the same days");
    }

}

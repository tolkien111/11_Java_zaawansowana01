package com.sda.opp.zadania.Zadanie2;

public class Staff extends Person{
    private String specjalizacja;
    private int wynagrodzenie;

    public Staff(String name, String address, String specjalizacja, int wynagrodzenie) {
        super(name, address);
        this.specjalizacja = specjalizacja;
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public int getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(int wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public String toString() {
        return "Lecturer{ " + getName() + ", " + getAddress()
                + " dane szczegolowe: " + "specjalizacja: " + specjalizacja
                + ", "  + "wynagrodzenie: " + wynagrodzenie + " }";
    }
}

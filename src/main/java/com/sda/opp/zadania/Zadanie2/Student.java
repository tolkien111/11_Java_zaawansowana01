package com.sda.opp.zadania.Zadanie2;

public class Student extends Person{
    private String typStudiow;
    private int rokStudiow;
    private int kosztStudiow;

    public Student(String name, String address, String typStudiow, int rokStudiow, int kosztStudiow) {
        super(name, address);
        this.typStudiow = typStudiow;
        this.rokStudiow = rokStudiow;
        this.kosztStudiow = kosztStudiow;
    }

    public String getTypStudiow() {
        return typStudiow;
    }

    public void setTypStudiow(String typStudiow) {
        this.typStudiow = typStudiow;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    public int getKosztStudiow() {
        return kosztStudiow;
    }

    public void setKosztStudiow(int kosztStudiow) {
        this.kosztStudiow = kosztStudiow;
    }

    @Override
    public String toString() {
        return "Student{ " + getName() + ", " + getAddress()
                + " dane szczegolowe: " + "typ studiów: " + typStudiow
                + ", "  + "rok studiów: " + rokStudiow
                + ", "  + "koszt studiów: " + kosztStudiow + " }";
    }
}

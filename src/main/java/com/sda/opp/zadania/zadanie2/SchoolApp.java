package com.sda.opp.zadania.zadanie2;

public class SchoolApp {

    public static void main(String[] args) {
        Student student = new Student("Piotr",
                "Samochodowa 1, Opoczno",
                "stacjonarne",
                1,
                2000 );
        student.setName("Piotr Adam");
        System.out.println(student);
        System.out.println("Rok studiów: " + student.getRokStudiow());


        Staff lecturer = new Staff("Adam",
                "Kowidowa 66, Gdańsk",
                "Matematyka",
                1800 );
        lecturer.setSpecjalizacja("Informatyka i Matematyka");
        System.out.println(lecturer);
        System.out.println("Wynagrodzenie: " + lecturer.getWynagrodzenie());




    }
}

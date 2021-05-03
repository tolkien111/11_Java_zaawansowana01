package com.sda.kolekcje.zadania.zadanie2;

import java.util.Objects;

public class Author {
    private String Name;
    private String Surname;
    private String gender;

    public Author(String name, String surname, String gender) {
        Name = name;
        Surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Name.equals(author.Name) && Surname.equals(author.Surname) && gender.equals(author.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Surname, gender);
    }

    @Override
    public String toString() {
        return "Author{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

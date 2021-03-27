package com.sda.basketball;

import java.util.Objects;

public class Player implements Comparable<Player> {
    private String firstName;
    private String lastName;
    private int height;
    private int earnings;

    public Player(String firstName, String lastName, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Player other) {
        if (this.getHeight() > other.getHeight()) {
            return 1;
        } else if (this.getHeight() < other.getHeight()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return height == player.height &&
                firstName.equals(player.firstName) &&
                lastName.equals(player.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, height);
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                '}';
    }
}

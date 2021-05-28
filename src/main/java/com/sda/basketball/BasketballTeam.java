package com.sda.basketball;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BasketballTeam {
    private Set<Player> players = new HashSet<>(); // Set domyślnie nie uszględnia kolejności elementów, dopiero LinkedHashSet jest daje tą możliwość


    //Zadanie 2 - JAVA_ZAAW_3
    public void addPlayer(Player player) throws InvalidPlayerException {
        if (player.getHeight() < 100 || player.getHeight() > 220) {
            throw new InvalidPlayerException("Wrong height");
        }
        if (player.getFirstName().isBlank()) {
            throw new InvalidPlayerException("First name consist only of whitespaces");
        }
        if (player.getLastName().isBlank()) {
            throw new InvalidPlayerException("Second name consist only of whitespaces");
        }
        players.add(player);
    }

    public Set<Player> getPlayers() {
        return players;
    }

//OPTIONAL

    public Optional<Player> getHigherThan200() { // używamy przy zwracaniu klasy Optional zamiast np. null, -> daje więcej możliwości
        for (Player player : players) {          // jeżeli nie mielibyśmy drugiego return to przy braku zawodnika powyżej 200 życiłoby wyjątkiem
            if (player.getHeight() > 200) {
                return Optional.of(player);
            }
        }

        return Optional.empty();
    }

    //Do PREDICATE
    public Set<Player> higherThan180ForLoop() { // zwracamy kolekcje graczy wyżsyzch niż 180
        Predicate<Player> playerPredicate = new HigherThan180();
        Set<Player> passed = new HashSet<>();
        for (Player player : players) {
            if (playerPredicate.test(player)) {
                passed.add(player);
            }
        }
        return passed;
    }

    //Do STREAM
    public Set<Player> higherThan180Stream() {
        Predicate<Player> higherThan180 = new HigherThan180();
        Set<Player> passed = new HashSet<>();

        passed = players.stream()               //strumieniuj
                .filter(higherThan180)          //przefiltrój
                .collect(Collectors.toSet());   //zbierz
        return passed;
    }

    //STREAM - finalny najkrótszy
    public Set<Player> higherThan180StreamFinal() {
        return players.stream()
                .filter(player -> player.getHeight() > 180)
                .collect(Collectors.toSet());
    }

    //Demo - zbiaramy tylko imiona
    public Set<String> getPlayerNames() {
        return players.stream()
                .filter(player -> player.getHeight() > 180)
                .map((player -> player.getFirstName()))
                .collect(Collectors.toSet());
    }


    public List<Player> getHigherPlayersThan200() {
        List<Player> playersHigherThan200 = new ArrayList<>();
        for (Player player : players) {
            if (player.getHeight() > 200) {
                playersHigherThan200.add(player);
            }
        }
        return playersHigherThan200;
    }
    //zadanie 4_JAVA_ZAAW 3

    public List<Player> sortByEarnings() {
        List<Player> playersList = new ArrayList<>(players);
        playersList.sort(new EarningsComparator());
        return playersList;
    }

    public Optional<Player> getPlayerWithTheHighestSalary() {
        return players.stream().max(new EarningsComparator());
    }

    public List<Player> sortByName() {
        List<Player> playersList = new ArrayList<>(players);
        playersList.sort((Player player01, Player player02) -> player01.getFirstName().compareTo(player02.getFirstName()));
        //playersList.sort(Comparator.comparing(Player::getFirstName)); //podpowiedź z IntelliJ
        return playersList;
    }

    //zadanie5_JADA_ZAAW 3

    public List<Player> sortByBirthdate() {
        List<Player> playersList = new ArrayList<>(players);
        playersList.sort(new BirthdayComparator());
        return playersList;
    }

    public List<Integer> showListAgeOfPlayer() {
        List<Integer> playersList = new ArrayList<>();
        for (Player player : players) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate birthdayPlayer = LocalDate.parse(player.getDateOfBirth(), formatter);
            Integer age = Period.between(birthdayPlayer, LocalDate.now()).getYears();
            playersList.add(age);
        }

        return playersList;
    }

    public List<Player> sortByAgeAndSalary() {
        List<Player> playersList = new ArrayList<>(players);
        playersList.sort(new BirthdayComparator().thenComparing(new EarningsComparator()));
        return playersList;
    }

    public Optional<Player> getPlayerWithTheHighestSalaryAndYoungerOfAgeLimit(int ageLimit) {
        List<Player> playersList = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        for (Player player : players) {
            LocalDate birthdayPlayer = LocalDate.parse(player.getDateOfBirth(), formatter);
            int age = Period.between(birthdayPlayer, LocalDate.now()).getYears();
            if (age < ageLimit) {
                playersList.add(player);
            }
        }
        return playersList
                .stream()
                .max(new EarningsComparator());

    }
}


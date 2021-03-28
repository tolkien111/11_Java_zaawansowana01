package com.sda.basketball;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BasketballTeam {
    private Set<Player> players = new HashSet<>(); // Set domyślnie nie uszględnia kolejności elementów, dopiero LinkedHashSet jest daje tą możliwość

    public void addPlayer(Player player) {
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
    public Set<String> getPlayerNames(){
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
}


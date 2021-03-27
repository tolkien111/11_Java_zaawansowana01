package com.sda.basketball;

import java.util.*;

public class BasketballTeam {
    private Set<Player> players = new HashSet<>(); // Set domyślnie nie uszględnia kolejności elementów, dopiero LinkedHashSet jest daje tą możliwość

    public void addPlayer(Player player) {
        players.add(player);
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public Optional<Player> getHigherThan200() { // używamy przy zwracaniu klasy Optional zamiast np. null,  ponieważ daje więcej możliwości
        for (Player player : players) {          // jeżeli nie mielibyśmy drugiego return to przy braku zawodnika powyżej 200 życiłoby wyjątkiem
            if (player.getHeight() > 200) {
                return Optional.of(player);
            }
        }

        return Optional.empty();
    }

//    public Optional<Player> getHigherPlayersThan200() {
//        List<Player> playersHigherThan200 = new ArrayList<>();
//        for (Player player : players) {
//            if (player.getHeight() > 200) {
//                playersHigherThan200.add(player);
//            }
//            return Optional.of(playersHigherThan200));
//        }
//        return Optional.empty();
//    }
}


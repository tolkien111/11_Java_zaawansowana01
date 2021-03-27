package com.sda.basketball;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class BasketballTeam {
    private Set<Player> players = new HashSet<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public Optional<Player> getHigherThan200() {
        for (Player player : players) {
            if (player.getHeight() > 200) {
                return Optional.of(player);
            }
        }

        return Optional.empty();
    }
}


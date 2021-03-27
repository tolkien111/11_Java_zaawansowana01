package com.sda.basketball;

import java.util.Comparator;

public class HeightComparator implements Comparator<Player> {
    public int compare(Player player1, Player player2) {
        return player1.getHeight() - player2.getHeight();
    }
}
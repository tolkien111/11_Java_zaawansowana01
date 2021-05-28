package com.sda.basketball;

import java.util.Comparator;

public class EarningsComparator implements Comparator<Player> {
    @Override
    public int compare(Player player01, Player player02) {
        return player01.getEarnings().compareTo(player02.getEarnings());
    }
}

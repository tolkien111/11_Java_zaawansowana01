package com.sda.basketball;

import java.util.function.Predicate;

//PREDICATE (PREDYKAT)
public class HigherThan180 implements Predicate<Player> {

    @Override
    public boolean test(Player player) {
        return player.getHeight() > 180;
    }
}


package com.sda.basketball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BasketballApp {
    public static void main(String[] args) {
        // ZESPOL BASKETBALL TEAM
        Player youngJordan = new Player("M", "J", 180);
        Player oldJordan = new Player("M", "J", 198);
        Player gortat = new Player("M", "G", 211);

        System.out.println("Oba Jordany tacy sami: " + youngJordan.equals(oldJordan));

        BasketballTeam team = new BasketballTeam();
        team.addPlayer(youngJordan);
        team.addPlayer(oldJordan);
        team.addPlayer(gortat);

        System.out.println(team.getPlayers());

        System.out.println(team.getHigherThan200());

        // SORTOWANIE
        List<Player> players = new ArrayList<>();
        players.add(new Player("najwyzszy", "kowalski", 200));
        players.add(new Player("najnizszy", "kowalski", 150));
        players.add(new Player("wyższy", "kowalski", 170));

        System.out.println("PRZED:");
        System.out.println(players);

        // natural order - od najmniejszego do najwyzszego
        players.sort(null);
        // to samo
        Collections.sort(players);

        System.out.println("PO NATUAL ORDER");
        System.out.println(players);

        // odwrocony
        players.sort(Comparator.reverseOrder());
        // to samo
        Collections.sort(players, Collections.reverseOrder());

        System.out.println("PO REVERSE ORDER");
        System.out.println(players);
    }
}

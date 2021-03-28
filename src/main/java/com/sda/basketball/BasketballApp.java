package com.sda.basketball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BasketballApp {
    public static void main(String[] args) {
        // ZESPOL BASKETBALL TEAM
        Player youngJordan = new Player("M", "J", 180); //dwóch jordanow, dwóch identycznych ale inaczej zadeklarowanych
        Player oldJordan = new Player("M", "J", 198);
        Player gortat = new Player("M", "G", 211);
        Player ming = new Player("Y", "M", 229);

        System.out.println("Oba Jordany tacy sami: " + youngJordan.equals(oldJordan));  // przed zmianą equals() i hashCode() wyświetliłoby że są różni
                                                                                        // wynika to z tego że obiekty ulokowane są w różnych miejscach pamięci
                                                                                        // należy nadpisać metodę equals() i hashCode() w player
                                                                                        // aby sprawdzało czy są tacy sami wg naszych kryteriów
        System.out.println("1\n");

        BasketballTeam team = new BasketballTeam();
        team.addPlayer(youngJordan);
        team.addPlayer(oldJordan);
        team.addPlayer(gortat);
        team.addPlayer(ming);

        System.out.println("przed filtrowaniem" + team.getPlayers());
        System.out.println("2\n");

        System.out.println(team.getHigherThan200().toString());
//Do PREDICATE
        System.out.println("przefiltrowane do 180 (Predicat + ForLoop): " + team.higherThan180ForLoop());
//STREAM
        System.out.println("Przefiltrowane ze STREAM: " + team.higherThan180Stream());
        System.out.println("Przefiltrowane imiona:" + team.getPlayerNames());
        System.out.println("3\n");

//        System.out.println(team.getHigherPlayersThan200());
//        System.out.println("4\n");

        System.out.println("-----------------------------------------------------------------"); // Druga część

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
        Collections.sort(players, Collections.reverseOrder()); //przyjmie do siebie tylko listy, które implementują comparatora

        System.out.println("PO REVERSE ORDER");
        System.out.println(players);
    }
}

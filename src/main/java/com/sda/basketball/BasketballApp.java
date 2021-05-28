package com.sda.basketball;

import com.sda.exceptions.InvalidNameException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BasketballApp {
    public static void main(String[] args) throws InvalidPlayerException {
        // ZESPOL BASKETBALL TEAM
        Player youngJordan = new Player("M ", "J", 180,new BigDecimal("2015"),"20-02-1979"); //dwóch jordanow, dwóch identycznych ale inaczej zadeklarowanych
        Player oldJordan = new Player("A", "J", 198,new BigDecimal("3000"),"20-02-1979");
        Player gortat = new Player("Z", " G", 211,new BigDecimal("2000"), "21-05-1981");
        Player ming = new Player("Y", "M", 229, new BigDecimal("3200"), "21-09-1975");
        Player oldPlayer = new Player("Y", "MY", 219, new BigDecimal("1955"), "21-09-1933");

        System.out.println("Oba Jordany tacy sami: " + youngJordan.equals(oldJordan));  // przed zmianą equals() i hashCode() wyświetliłoby że są różni
        // wynika to z tego że obiekty ulokowane są w różnych miejscach pamięci
        // należy nadpisać metodę equals() i hashCode() w player
        // aby sprawdzało czy są tacy sami wg naszych kryteriów
        System.out.println("1\n");


        BasketballTeam team = new BasketballTeam();
        try {
            team.addPlayer(youngJordan);
        } catch (InvalidPlayerException exception) {
            exception.printStackTrace();
        }
        try {
            team.addPlayer(oldJordan);
        } catch (InvalidPlayerException exception) {
            exception.printStackTrace();
        }
        try {
            team.addPlayer(gortat);
        } catch (InvalidPlayerException exception) {
            exception.printStackTrace();
        }
        try {
            team.addPlayer(ming);
        } catch (InvalidPlayerException exception) {
            exception.printStackTrace();
        }
        try {
            team.addPlayer(oldPlayer);
        } catch (InvalidPlayerException exception) {
            exception.printStackTrace();
        }

        System.out.println("przed filtrowaniem" + team.getPlayers());
        System.out.println("2\n");

        System.out.println(team.getHigherThan200().toString());
//Do PREDICATE
        System.out.println("przefiltrowane do 180 (Predicat + ForLoop): " + team.higherThan180ForLoop());
//STREAM
        System.out.println("Przefiltrowane ze STREAM: " + team.higherThan180Stream());
        System.out.println("Przefiltrowane imiona:" + team.getPlayerNames());
        System.out.println("3\n");

        System.out.println(team.getHigherPlayersThan200());
        System.out.println("4\n");

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

        // Collections.sort przyjmie do siebie tylko listy, które implementują comparatora
        Collections.sort(players);
        System.out.println(players);

        // odwrocony
        players.sort(Comparator.reverseOrder());
        // to samo
        Collections.sort(players, Collections.reverseOrder()); //przyjmie do siebie tylko listy, które implementują comparatora

        System.out.println("PO REVERSE ORDER");
        System.out.println(players);
        System.out.println("5\n");

        //zadanie 4_JAVA_ZAAW 3

        System.out.println(team.sortByEarnings());
        System.out.println("6\n");
        System.out.println(team.getPlayerWithTheHighestSalary());
        System.out.println("7\n");
        System.out.println(team.sortByName());
        System.out.println("8\n");

        //zadanie 5_JAVA_ZAAW 3
        System.out.println(team.sortByBirthdate());
        System.out.println("8\n");
        team.showListAgeOfPlayer();
        System.out.println(team.showListAgeOfPlayer());
        System.out.println("9\n");
        System.out.println(team.sortByAgeAndSalary());
        System.out.println("10\n");
        System.out.println(team.getPlayerWithTheHighestSalaryAndYoungerOfAgeLimit(45));
    }
}

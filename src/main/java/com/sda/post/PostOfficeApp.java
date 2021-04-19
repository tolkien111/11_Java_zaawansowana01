package com.sda.post;

// Zadanie do ENUM, zadanie 7.2/str.88

import java.util.Arrays;
import java.util.Scanner;

public class PostOfficeApp {
    public static void main(String[] args) throws InvalidStateException {

        PackageStatus sentStatus = PackageStatus.SENT;
        System.out.println(sentStatus);
        System.out.println("1");

        Package myPackage = new Package(PackageStatus.COURIER, "Telefon");
        System.out.println(myPackage);
        System.out.println("2");

        myPackage.changeStatus(PackageStatus.LOST);
        System.out.println(myPackage);
        System.out.println("3");

        PackageStatus[] packageStatuses = PackageStatus.values(); //zwraca wszystkie wartości klasy ENUM
        for (PackageStatus packageStatus : packageStatuses) {
            System.out.println(packageStatus);
        }
        System.out.println("4");

        PackageStatus packageStatusesNew = PackageStatus.valueOf("COURIER");
        System.out.println(packageStatusesNew);
        System.out.println("5");

        //Użycie statycznej metody w ENUM
        PackageStatus[] errorStatuses = PackageStatus.getErrorStatuses();
        for (PackageStatus errorPackageStatus : errorStatuses) {
            System.out.println(errorPackageStatus);
        }
        System.out.println("6");

        //Użycie niestetycznej metody w ENUM
        System.out.println(PackageStatus.SENT.isError());
        System.out.println(PackageStatus.RETURNED.isError());
        System.out.println("7");

//Zadanie 9 ZAAW2/str.92/


        Package box = new Package();

        for (PackageStatus status : PackageStatus.values()) {
            System.out.println(status.getDescription());
        }

        Scanner sc = new Scanner(System.in);

        boolean statusIsTrue = false;

        while (!statusIsTrue) {
            System.out.println("Wpisz aktualny status paczki z listy wydrukowanej powyżej");
            String chosenPackageStatus = sc.nextLine();


            for (PackageStatus status : PackageStatus.values()) {
                if (status.getDescription().equalsIgnoreCase(chosenPackageStatus)) {
                    box.changeStatus(status);
                    System.out.println(box);
                    statusIsTrue = true;
                    break;

                } else if (!status.getDescription().equalsIgnoreCase(chosenPackageStatus) && PackageStatus.RETURNED == status)
                System.out.println("błędny status"); //bardzo proste ograniczenie żeby "błedny status" został wyświetlony raz. Inny pomysł?
            }
        }


        System.out.println("8");

// Zadanie 10.1 i 10.2/ZAAW2/str.95

        PackageStatus[] status = PackageStatus.SENT.getNextStatuses();
        System.out.println(Arrays.toString(status));

        Package newBox = new Package();

        try {
            newBox.changeStatus(PackageStatus.SENT);

        } catch (InvalidStateException invalidStateException) {
            System.out.println("Podano błędny status");
        }

        System.out.println(newBox);
        System.out.println("-----------");

        try {
            newBox.changeStatus(PackageStatus.DELIVERED);
        } catch (InvalidStateException invalidStateException) {
            System.out.println("Podano błędny status");
        }
        System.out.println(newBox);

    }


}


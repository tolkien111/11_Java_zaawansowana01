package com.sda.post;

// Zadanie do ENUM, zadanie 7.2/str.88

public class PostOfficeApp {
    public static void main(String[] args) {

        PackageStatus sentStatus = PackageStatus.SENT;
        System.out.println(sentStatus);
        System.out.println("1");

        Package myPackage = new Package(PackageStatus.COURIER, "Telefon");
        System.out.println(myPackage);
        System.out.println("2");

        myPackage.changeStatus(PackageStatus.LOST);
        System.out.println(myPackage);
        System.out.println("3");

        PackageStatus [] packageStatuses = PackageStatus.values(); //zwraca wszystkie wartości klasy ENUM
        for (PackageStatus packageStatus: packageStatuses){
            System.out.println(packageStatus);
        }
        System.out.println("4");

        PackageStatus packageStatusesNew = PackageStatus.valueOf("COURIER");
        System.out.println(packageStatusesNew);
        System.out.println("5");

        //Użycie statycznej metody w ENUM
        PackageStatus [] errorStatuses = PackageStatus.getErrorStatuses();
        for (PackageStatus errorPackageStatus: errorStatuses){
            System.out.println(errorPackageStatus);
        }
        System.out.println("6");

        //Użycie niestetycznej metody w ENUM
        System.out.println(PackageStatus.SENT.isError());
        System.out.println(PackageStatus.RETURNED.isError());
    }
}

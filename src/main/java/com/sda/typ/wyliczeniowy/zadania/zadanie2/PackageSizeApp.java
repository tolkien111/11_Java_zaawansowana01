package com.sda.typ.wyliczeniowy.zadania.zadanie2;

public class PackageSizeApp {

    public static void main(String[] args) {

        PackageSize package01 = PackageSize.getPackageSize(5, 15);
        PackageSize package02 = PackageSize.getPackageSize(20, 32);
        PackageSize package03 = PackageSize.getPackageSize(30, 70);

        System.out.println(package01);
        System.out.println(package02);
        System.out.println(package03);

    }
}

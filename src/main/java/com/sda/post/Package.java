package com.sda.post;

import java.util.UUID;

public class Package {
    PackageStatus packageStatus;
    String whatIsInside;
    String packageNumber;

    public Package(PackageStatus packageStatus, String whatIsInside) {
        this.packageStatus = packageStatus;
        this.whatIsInside = whatIsInside;
        this.packageNumber = UUID.randomUUID().toString();//losowy ciąg znaków przerzucony do stringa
    }

    void changeStatus (PackageStatus packageStatus){
        this.packageStatus = packageStatus;
    }

    @Override
    public String toString() {
        return "Package{" +
                "packageStatus=" + packageStatus +
                ", whatIsInside='" + whatIsInside + '\'' +
                ", packageNumber='" + packageNumber + '\'' +
                '}';
    }
}

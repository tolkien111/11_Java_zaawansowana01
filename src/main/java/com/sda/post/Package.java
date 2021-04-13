package com.sda.post;

import com.sda.exceptions.calc.triangles.InvalidInputException;

import java.util.UUID;

public class Package {
    PackageStatus packageStatus;
    String whatIsInside;
    String packageNumber;

    public Package() {
    }

    public Package(PackageStatus packageStatus, String whatIsInside) {
        this.packageStatus = packageStatus;
        this.whatIsInside = whatIsInside;
        this.packageNumber = UUID.randomUUID().toString();//losowy ciąg znaków przerzucony do stringa
    }

//Zadanie 10.2/ZAAW2/str.96
    void changeStatus (PackageStatus packageStatus) throws InvalidStateException {
        if (this.packageStatus == null || this.packageStatus == packageStatus) {
            this.packageStatus = packageStatus;
            return;
        }
        for (PackageStatus packageStatus1 : this.packageStatus.getNextStatuses()) {
            if (packageStatus.equals(packageStatus1)) {
                this.packageStatus = packageStatus;
                break;
            }
            throw new InvalidStateException();
        }
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

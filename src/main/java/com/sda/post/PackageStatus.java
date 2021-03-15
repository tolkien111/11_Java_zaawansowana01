package com.sda.post;

public enum PackageStatus {
    SENT("wysłana"),
    TRAVELING("podróżuje"),
    COURIER("W doręczeniu"),
    DELIVERED("dostarczona"),
    LOST("zagubiona"),
    RETURNED("zwrócona");

    private String description;

    PackageStatus(String d) { // opis do enuma, niepełne info
        this.description = d;
    }

    public String getDescription() {
        return description;
    }
    //statyczna metoda w klasie enum
    public static PackageStatus[] getErrorStatuses() {
        PackageStatus[] packageStatuses = {LOST, RETURNED};
        return packageStatuses;
    }

    //niestatyczna metoda w klasie enum
    public boolean isError() {
//        if (this == LOST || this == RETURNED) {
//            return true;
//        } else {
//            return false;
//        }
        return this == LOST || this == RETURNED; // najkrótszy sposób pokazania wartości boolean w naszym przykładzie
    }

    @Override
    public String toString() {
        return "PackageStatus{" +
                "description='" + description + '\'' +
                '}';
    }
}


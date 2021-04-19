package com.sda.post;


public enum PackageStatus {
    SENT("wysłana") {
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus []{TRAVELING, LOST};

        }
    },
    TRAVELING("podróżuje") {
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus[]{COURIER, LOST};
        }
    },

    COURIER("w doręczeniu") {
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus[]{DELIVERED, RETURNED, LOST};
        }
    },
    DELIVERED("dostarczona") {
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus[]{};
        }
    },
    LOST("zagubiona") {
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus[]{};
        }
    },
    RETURNED("zwrócona") {
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus[]{};
        }
    };

    private final String description;

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

//Zadanie 10.1/ZAAW2/str.92
    public abstract PackageStatus [] getNextStatuses();


    @Override
    public String toString() {
        return "PackageStatus{" +
                "description='" + description + '\'' +
                '}';
    }
}


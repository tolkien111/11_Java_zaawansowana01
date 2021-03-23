package com.sda.typ.wyliczeniowy.zadania.zadanie2;

public enum PackageSize {
    WRONG_DIMENTION (0, 0),
    SMALL(1, 20),
    MEDIUM(21, 40),
    LARGE(41, 60);


    private int minSize;
    private int maxSize;

    PackageSize(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    public static PackageSize getPackageSize(int minSize, int maxSize ){
        for (PackageSize packageSize : PackageSize.values()){
            if (minSize >= packageSize.minSize && maxSize <= packageSize.maxSize ){
                return packageSize;
            }
        }
        return WRONG_DIMENTION;
    }
}

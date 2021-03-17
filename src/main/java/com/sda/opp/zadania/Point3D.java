package com.sda.opp.zadania;

public class Point3D extends  Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public float [] getXYZ(){
        float [] arrayThreeElements = {getX(), getY(), z};
        return  arrayThreeElements;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void  setXYZ (float x, float y,float z){
        float [] xyArray = {x, y, z};
    }

    @Override
    public String toString() {
        return "(" + getX() +", " + getY() +", " + z + ")";
    }
}

package com.sda.opp.zadania;

import java.util.Arrays;

public class Point3dApp {

    public static void main(String[] args) {



        Point2D point2D = new Point2D();
        point2D.setX(123.234f);
        point2D.setY(234.0978f);
        point2D.getX();
        point2D.toString();
        point2D.setXY(123,123.234f);
        point2D.getYX();

        Point3D point3D = new Point3D(0.2f,5,1.1f);

        point3D.setX(123.234f);
        point3D.setY(234.0978f);
        point3D.getX();
        point3D.toString();
        point3D.setXY(123,123.234f);
        point3D.getYX();

        System.out.println(point3D);


        System.out.println(point3D);
        float [] a = point3D.getXYZ();
        point3D.getXYZ();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(point3D.getXYZ()));

    }
}

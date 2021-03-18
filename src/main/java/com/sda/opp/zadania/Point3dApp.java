package com.sda.opp.zadania;

import java.util.Arrays;

public class Point3dApp {

    public static void main(String[] args) {


        Point2D point2D = new Point2D();
        point2D.setX(123.234f);
        point2D.setY(234.0978f);
        point2D.getX();
        point2D.toString();
        point2D.setXY(123, 123.234f);
        point2D.getYX();

        Point3D point3D = new Point3D(0.2f, 5, 1.1f);

        point3D.setX(123.234f);
        point3D.setY(234.0978f);
        point3D.getX();
        point3D.toString();
        point3D.setXY(123, 123.234f);
        point3D.getYX();

        System.out.println(point3D);

        float[] a = point3D.getXYZ();
        point3D.getXYZ();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println("----------------------------------");

        Point2D pointXY1 = new Point2D();
        pointXY1.setXY(1, 2);
        Point2D pointXY2 = new Point2D();
        pointXY2.setXY(3, 5);
        Line line = new Line(pointXY1, pointXY2);
        System.out.println(line.lenghtLine());
        System.out.println(line.centerPointofLine());


        Line line1 = new Line(1, 2, 3, 5);
        System.out.println(line1.lenghtLine());
        System.out.println(line1.centerPointofLine());

    }
}

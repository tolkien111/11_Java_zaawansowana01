package com.sda.opp.zadania;

public class Line {
    private Point2D point01;
    private Point2D point02;


    public Line(Point2D point01, Point2D point02) {
        this.point01 = point01;
        this.point02 = point02;
    }
    public Line(float a, float b, float c, float d){
        this.point01= new Point2D(a, b);
        this.point02= new Point2D(c, d);
    }

    public float lenghtLine(){
        float lenghtLine = (float) Math.sqrt(Math.pow(point01.getX() - point02.getX(), 2) + Math.pow(point01.getY()- point02.getY(), 2));
        return lenghtLine;
    }

    public Point2D getPoint01() {
        return point01;
    }

    public void setPoint01(Point2D point01) {
        this.point01 = point01;
    }

    public Point2D getPoint02() {
        return point02;
    }

    public void setPoint02(Point2D point02) {
        this.point02 = point02;
    }
}



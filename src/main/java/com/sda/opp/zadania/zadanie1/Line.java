package com.sda.opp.zadania.zadanie1;

public class Line {
    private Point2D point01;
    private Point2D point02;


    public Line(Point2D point01, Point2D point02) {
        this.point01 = point01;
        this.point02 = point02;
    }
    public Line(float x1, float y1, float x2, float y2){
        this.point01= new Point2D(x1, y1);
        this.point02= new Point2D(x2, y2);
    }

    public float lenghtLine(){
        float lenghtLine = (float) Math.sqrt(Math.pow(point01.getX() - point02.getX(), 2) + Math.pow(point01.getY()- point02.getY(), 2));
        return lenghtLine;
    }

    public Point2D centerPointofLine(){
        float x3 = (point01.getX() + point02.getX())/2;
        float y3 = (point01.getY() + point02.getY())/2;
        Point2D centerPoint = new Point2D(x3, y3);
        return centerPoint;
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



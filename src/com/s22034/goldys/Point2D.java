package com.s22034.goldys;

public class Point2D {

    double x, y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point2D point2D){
        return Math.sqrt(
                Math.pow(getX() - point2D.getX(), 2) + Math.pow(getY() - point2D.getY(), 2)
        );
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
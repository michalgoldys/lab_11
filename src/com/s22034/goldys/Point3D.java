package com.s22034.goldys;

public class Point3D extends
        Point2D{

    double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public double distance(Point3D point3D){
        return Math.sqrt(
                Math.pow(getZ() - point3D.getZ(), 2) + Math.pow(getY() - point3D.getY(), 2) + Math.pow(getX() - point3D.getX(),2)
        );
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
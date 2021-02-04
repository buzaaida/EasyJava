package com.company;

public class Cylinder extends GeometricBody {
    String name;
    static final double pi=3.14;
    double r, h;
    public Cylinder(String name, double r, double h) {
        super(name);
        this.r=r;
        this.h=h;
    }
    @Override
    public double Area() {
        return 2*pi*r*h+2*pi*r*r;
    }
}

package com.company;

public class Cone extends GeometricBody {
    String name;
    static final double pi=3.14;
    double r, h;
    public Cone(String name, double r, double h) {
        super(name);
        this.r=r;
        this.h=h;
    }
    @Override
    public double Area() {
        double one=pi*r;
        double two=r+Math.sqrt(h*h+r*r);
        return one*two;
    }
}

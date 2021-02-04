package com.company;

public class Circle extends Shapes{
    double r;
    double area;
    final static double pi=3.14;
    public Circle(int x, int y, String name, String color, double r) {
        super(x, y, name, color);
        this.r=r;
    }
    public void show() { super.show(); }
    @Override
    public void Area() { System.out.println("area: " + 2*pi*r); }
}

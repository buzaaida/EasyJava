package com.company;

public class Rectangle extends Shapes {
    double a, b;
    double area;
    public Rectangle(int x, int y, String name, String color, int a, int b) {
        super(x, y, name, color);
        this.a=a;
        this.b=b;
    }
    @Override
    public void show() {
        System.out.println("position x: " + x + ", position y: " + y + ", name: " + name + ", color: " + color);
    }
    /*public double Area(double a, double b) {
        return a*b;
    }*/

    @Override
    public void Area() { System.out.println("area: " + a*b); }
}

package com.company;

public class Square extends Shapes {
    double a;
    double area;
    public Square(int x, int y, String name, String color, double a) {
        super(x, y, name, color);
        this.a=a;
    }
    public void show() {
        super.show();
    }
    @Override
    public void Area() {
        System.out.println("area: " + a*a);
    }
}

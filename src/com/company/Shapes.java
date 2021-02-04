package com.company;

public class Shapes {
    int x, y;
    String name, color;
    public Shapes(int x, int y, String name, String color) {
        this.x=x;
        this.y=y;
        this.name=name;
        this.color=color;
    }
    public void show() { System.out.println("position x: " + x + ", position y: " + y + ", name: " + name + ", color: " + color); }
    public void Area () { System.out.println("area: "); }
}

package com.company;

public class MainShapes {
    public static void main(String[] args) {
        Shapes shape=new Shapes(0, 0, "shape", "rainbow");
        //shape.show();
        Rectangle rectangle=new Rectangle(3, 3, "rectangle", "red", 18, 3);
        rectangle.show();
        rectangle.Area();
        Square square=new Square(6, 6,"square", "green", 29.6);
        square.show();
        square.Area();
        Circle circle=new Circle(5, 5, "circle", "yellow", 16.5);
        circle.show();
        circle.Area();
    }
}

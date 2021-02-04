package com.company;

public abstract class Product {
    String name;
    int barCode;
    double price;
    final static double tax=0.2;
    public Product (String name, int barCode, double price) {
        this.name=name;
        this.barCode=barCode;
        this.price=price;
    }
    public abstract double GivePrice();
}

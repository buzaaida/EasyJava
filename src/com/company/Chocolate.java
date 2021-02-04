package com.company;

public class Chocolate extends Product {
    public Chocolate(String name, int barCode, double price) {
        super(name, barCode, price);
    }
    @Override
    public double GivePrice() {
        return (price+(price*tax));
    }
    @Override
    public String toString() {
        return "name: "+this.name+"\nbarcode: "+this.barCode+"\nprice: "+GivePrice();
    }
}

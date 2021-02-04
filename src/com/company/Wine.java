package com.company;

public class Wine extends Product {
    final static double wineTax=0.1;
    public Wine(String name, int barCode, double price) {
        super(name, barCode, price);
    }
    @Override
    public double GivePrice() {
        return price+(price*tax*wineTax);
    }
    @Override
    public String toString() {
        return  "name: "+this.name+"\nbarcode: "+this.barCode+"\nprice: "+GivePrice();
    }
}

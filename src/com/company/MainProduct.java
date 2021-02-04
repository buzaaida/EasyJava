package com.company;

public class MainProduct {
    public static void main(String[] args) {
        Chocolate chocolate=new Chocolate("Lindt", 55555, 4.25);
        Wine wine=new Wine("Pinot noir", 11111, 55.55);
        System.out.println(chocolate.toString());
        System.out.println();
        System.out.println(wine.toString());
    }
}

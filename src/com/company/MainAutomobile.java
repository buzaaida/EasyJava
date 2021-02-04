package com.company;

public class MainAutomobile {
    public static void main(String[] args) {
        Automobile a1=new Automobile("BMW", "m4", 2020, /*425*/ "turbo", 6, 6, "RWD", 4, 5);
        Automobile a2=new Automobile("BMW", "x6", 2020, /*335*/ "turbo", 6, 6, "AWD", 5, 5);
        Automobile a3=new Automobile("BMW", "i8", 2020, /*228*/ "turbo", 6, 6, "RWD", 2, 3);
        a1.horsepower=425;
        a2.horsepower=335;
        a3.horsepower=228;
        System.out.println(a1.toString()+"\n");
        System.out.println(a2.toString()+"\n");
        System.out.println(a3.toString()+"\n");
        System.out.println("The fastest car is the "+a1.brand+" "+a1.model+" with "+a1.horsepower+" hp.");
    }
}

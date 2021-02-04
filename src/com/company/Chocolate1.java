package com.company;

public class Chocolate1 extends Sweet {
    String brand = "Milka";
    String name = "Strawberry Yogurt";
    String madeIn = "made in Switzerland";
    long expDate = 28032021;
    double caloriesNum = 549;
    public void PrintDetails() {
        super.PrintDetails();
        System.out.println(name);
        System.out.println(brand);
        System.out.println(caloriesNum);
        System.out.println(expDate);
        System.out.println(madeIn);
    }
}

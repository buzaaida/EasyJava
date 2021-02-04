package com.company;

public class IceCream extends Sweet {
    String brand="Ben & Jerry's";
    String name="Cherry Garcia";
    String madeIn="made in the United States";
    long expDate=22092021;
    double caloriesNum=140;
    public void PrintDetails() {
        super.PrintDetails();
        System.out.println(name);
        System.out.println(brand);
        System.out.println(caloriesNum);
        System.out.println(expDate);
        System.out.println(madeIn);
    }
}

package com.company;

public class Products {
    public static void main(String[] args) {
        String[] type={"bicycle", "car", "phone"};
        String[] name={"BMX", "BMW m3", "iPhone XS"};
        double[] price={150.95, 50000.95, 1000.95};
        System.out.println(name[0]+" is a "+type[0]+" and costs "+price[0]+" €.");
        System.out.println(name[1]+" is a "+type[1]+" and costs "+price[1]+" €.");
        System.out.println(name[2]+" is a "+type[2]+" and costs "+price[2]+" €.");
    }
}

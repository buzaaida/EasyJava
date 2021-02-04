package com.company;

public class Car {
    String make;
    String model;
    int numberOfDoors;
    static final int numberOfWheels = 4;
    public static void NumberOfWheels() {
        System.out.println(numberOfWheels);
    }
    public void PrintDetails() {
        System.out.println("Car make: " + make);
        System.out.println("Car model: " + model);
        System.out.println("Number of doors: " + numberOfDoors);
    }
    public Car() {
        make = "BMW";
        model = "m3 2018";
        numberOfDoors = 4;
    }
}


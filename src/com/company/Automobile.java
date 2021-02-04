package com.company;

public class Automobile {
    String brand;
    String model;
    int year;
    int horsepower;
    String engine_type;
    int cylinders;
    int transmission;
    String drive_type;
    int seats;
    int doors;
    public Automobile(String brand, String model, int year, /*int horsepower*/ String engine_type, int cylinders, int transmission, String drive_type, int seats, int doors) {
    this.brand=brand;
    this.model=model;
    this.year=year;
    //this.horsepower=horsepower;
    this.engine_type=engine_type;
    this.cylinders=cylinders;
    this.transmission=transmission;
    this.drive_type=drive_type;
    this.seats=seats;
    this.doors=doors;
    }
    @Override
    public String toString() {
        return "brand: "+this.brand+"\nmodel: "+this.model+"\nyear: "+this.year+"\nhorsepower: "+this.horsepower+"\nengine type: "+this.engine_type+"\ncylinders: "+this.cylinders+"\ntransmission: "+this.transmission+"\ndrive type: "+this.drive_type+"\nseats: "+this.seats+"\ndoors: "+this.doors;
    }
}

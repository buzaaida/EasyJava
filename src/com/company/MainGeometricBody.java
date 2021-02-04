package com.company;

public class MainGeometricBody {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder("cylinder", 15, 25);
        Cone cone=new Cone("cone", 5, 12);
        System.out.println(cylinder.toString());
        System.out.println(cone.toString());
    }
}

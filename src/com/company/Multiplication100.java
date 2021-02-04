package com.company;

public class Multiplication100 {
    public static void main(String[] args) {
        int product=1;
        System.out.println("   |1    2    3    4    5    6    7    8    9   10|");
        System.out.println("   ________________________________________________");
        for (int i=1; i<=10; i++) {
            for (int j=1; j<=10; j++) {
                System.out.printf("%5d", i*j);
            }
            System.out.println(" ");
        }
        System.out.println("   ________________________________________________");
    }
}

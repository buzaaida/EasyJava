package com.company;

public class Main5th {
    public static void main(String[] args) {
        for (int i=0; i<5;) {
            //Switch ispisuje sve slucajeve dok ne dode do kraja for petlje zato sto nema break nakon pojedinacnih slucajeva.
            switch (i++) {
                case 1:
                    System.out.println("a");
                case 2:
                    System.out.println("b");
                case 3:
                    System.out.println("c");
                case 4:
                    System.out.println("d");
                    continue;
                default: System.out.println("e"); // Ispisuje se prvo jer je na pocetku i==0.
            }
        }
    }
}

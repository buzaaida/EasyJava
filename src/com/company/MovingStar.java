package com.company;

public class MovingStar extends Thread {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            for (int i=0; i<10; i++) {
                for(int j=0; j<i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*\r");
                Thread.sleep(100);
            }
            for (int i=10; i>0; i--) {
                for (int j=0; j<i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*\r");
                Thread.sleep(100);
            }
        }
    }
}

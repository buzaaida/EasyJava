package com.company;

public class DancingStars extends Thread {
    public static void main(String[] args) {
        while (currentThread().isAlive()) {
            for (int i=0; i<6; i++) {
                for (int j=0; j<6; j++) {
                    if(i==0 && j==0)
                        try {
                            System.out.println("\r*");
                            Thread.sleep(1000);
                        } catch (InterruptedException e) { System.out.println(e); }
                    if(i==1 && j==0)
                        try {
                            System.out.println("\r *");
                            Thread.sleep(1000);
                        } catch (InterruptedException e) { System.out.println(e); }
                    if(i==2 && j==0)
                        try {
                            System.out.println("\r  *");
                            Thread.sleep(1000);
                        } catch (InterruptedException e) { System.out.println(e); }
                    if(i==3 && j==0)
                        try {
                            System.out.println("\r   *");
                            Thread.sleep(1000);
                        } catch (InterruptedException e) { System.out.println(e); }
                    if(i==4 && j==0)
                        try {
                            System.out.println("\r  *");
                            Thread.sleep(1000);
                        } catch (InterruptedException e) { System.out.println(e); }
                    if(i==5 && j==0)
                        try {
                            System.out.println("\r *");
                            Thread.sleep(1000);
                        } catch (InterruptedException e) { System.out.println(e); }
                    if(i==6 && j==0)
                        try {
                            System.out.println("\r*");
                            Thread.sleep(1000);
                        } catch (InterruptedException e) { System.out.println(e); }
                }
            }
        }
    }
}

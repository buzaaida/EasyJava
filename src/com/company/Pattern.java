package com.company;

public class Pattern {
    public static void main(String[] args) {
        int w=10;
        int h=20;
        for (int i=0; i<w; i++) {
            for (int j=0; j<h; j++) {
                if(i==0 || j==0 || i==w-1 || j==h-1) {
                    System.out.print("#");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}

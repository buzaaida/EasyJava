package com.company;

import java.util.Scanner;

public class Board {
    public static void main(String[] args) {
        System.out.println("Enter board size: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i==j) {
                    System.out.print("1");
                }
                else if (i<j) {
                    System.out.print("g");
                }
                else System.out.print("d");
            }
            System.out.println();
        }
    }
}

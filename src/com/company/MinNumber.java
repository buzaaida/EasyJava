package com.company;
import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        System.out.println("Enter 4 random numbers: ");
        double a, b, c, d;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();
        d=scanner.nextDouble();
        System.out.println("Minimum of entered numbers: "+Math.min(a,(Math.min(b,Math.min(c,d)))));
    }
}

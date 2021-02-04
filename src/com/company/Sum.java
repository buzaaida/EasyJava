package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter two real numbers: ");
        Scanner scanner=new Scanner(System.in);
        double num1, num2;
        num1=scanner.nextDouble();
        num2=scanner.nextDouble();
        System.out.println("Sum of entered numbers: "+(num1+num2));
    }
}

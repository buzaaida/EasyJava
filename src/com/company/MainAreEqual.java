package com.company;

import java.util.Scanner;

public class MainAreEqual {
    public static void main(String[] args) {
        System.out.println("Please enter two random numbers: ");
        double num1, num2;
        Scanner scanner=new Scanner(System.in);
        num1=scanner.nextDouble();
        num2=scanner.nextDouble();
        AreEqual areEqual=new AreEqual();
        System.out.println("Entered numbers are equal: " + areEqual.equal(num1, num2));
    }
}

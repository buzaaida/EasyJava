package com.company;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter tvo numbers: ");
        double op1=scanner.nextDouble();
        double op2=scanner.nextDouble();
        System.out.println("Which operation do you want to perform?");
        String operation= scanner.next();
        switch (operation) {
            case "+":
                System.out.println(op1+op2);
                break;
            case "-":
                System.out.println(op1-op2);
                break;
            case "*":
                System.out.println(op1*op2);
                break;
            case "/":
                System.out.println(op1/op2);
                break;
            case "%":
                System.out.println(op1%op2);
                break;
        }
    }
}

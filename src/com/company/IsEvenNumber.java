package com.company;
import java.util.Scanner;

public class IsEvenNumber {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter a variable: ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        if(x%2==0) System.out.println("Variable is even: true");
        else System.out.println("Variable is even: false");
    }
}

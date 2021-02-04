package com.company;
import java.util.Scanner;

public class IsEvenNumber1 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        System.out.println("Entered number is even: " + (num%2 == 0));
    }
}

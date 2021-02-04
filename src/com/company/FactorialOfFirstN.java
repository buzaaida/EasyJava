package com.company;

import java.util.Scanner;

public class FactorialOfFirstN {
    public static void main(String[] args) {
        System.out.println("Till which number? (n): ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("Factorial of first n numbers: "+FactorialN(n));
    }

    public static int FactorialN(int n) {
        if (n==0) return 1;
        return n*FactorialN(n-1);
    }
}

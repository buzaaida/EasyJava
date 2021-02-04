package com.company;

import java.util.Scanner;

public class SumOfFirstN {
    public static void main(String[] args) {
        System.out.println("Till which number? (n): ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("Sum of first n: "+SumN(n));
    }
    public static int SumN(int n) {
        int sum=0;
        if (n<=1) return n;
        return n+SumN(n-1);
    }
}

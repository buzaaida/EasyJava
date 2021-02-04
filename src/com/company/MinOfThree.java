package com.company;

import java.util.Scanner;

public class MinOfThree {
    public static void main(String[] args) {
        System.out.println("Enter three random numbers: ");
        Scanner scanner=new Scanner(System.in);
        long a, b, c;
        a=scanner.nextLong();
        b=scanner.nextLong();
        c=scanner.nextLong();
        if ((a<c && a==b) || (a<b && a<c)) System.out.println(a+" is the minimum");
        else if ((b<c && b==a) || (b<a && b<c)) System.out.println(b+" is the minimum");
        else System.out.println(c+" is the minimum");
    }
}

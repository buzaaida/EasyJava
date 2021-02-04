package com.company;

public class MainCalculator {
    public static void main (String[] args){
        Calculator calculator=new Calculator();
        System.out.println(calculator.Add(5, 5));
        System.out.println(calculator.Sub(5, 5));
        System.out.println(calculator.Mul(5, 5));
        System.out.println(calculator.Div(5, 5));
        System.out.println(calculator.Mod(5, 5));
        System.out.println(calculator.Square(5));
        System.out.println(calculator.Power(5, 5));
        System.out.println(calculator.Root(5));
        System.out.println(calculator.NthRoot(10, 5));
    }
}

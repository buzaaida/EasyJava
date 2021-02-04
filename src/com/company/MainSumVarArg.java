package com.company;

public class MainSumVarArg {
    public static void main(String[] args) {
        SumVarArg s=new SumVarArg();
        int sum1=s.Sum(2);
        System.out.println("Sum is: "+sum1);
        int sum2=s.Sum(2, 5, 3);
        System.out.println("Sum is: "+sum2);
        int sum3=s.Sum(2, 5, 3, 100, 120, 77);
        System.out.println("Sum is: "+sum3);
    }
}

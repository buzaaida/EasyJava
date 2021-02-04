package com.company;

public class SumVarArg {
    public int Sum(int ... args) {
        int sum=0;
        for (int num:args) {
            sum+=num;
        }
        return sum;
    }
}

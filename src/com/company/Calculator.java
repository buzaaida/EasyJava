package com.company;
import java.lang.Math;

public class Calculator {
    double op1, op2;
    double Add(double op1, double op2) {
        return op1+op2;
    }
    double Sub(double op1, double op2) {
        return op1-op2;
    }
    double Mul(double op1, double op2) {
        return op1*op2;
    }
    double Div(double op1, double op2) {
        return op1/op2;
    }
    double Mod(double op1, double op2) {
        return op1%op2;
    }
    double Square(double op1) {
        double res=1;
        for (int i=1; i<=2; i++) {
            res*=op1;
        }
        return res;
    }
    /*double Power(double op1, double op2) {
        return Math.pow(op1, op2);
    }*/
    double Power(double op1, double op2) {
        double res=1;
        if (op2==0) res=1;
        else if (op2!=0) {
            for (int i=1; i<=op2; i++) {
                res*=op1;
            }
        }
        return res;
    }
    /*double Root(double op1) {
        return Math.sqrt(op1);
    }*/
    double Root(double op1) {
        int op2=1/2;
        double res=1;
        if (op1==0||op1==1) return op1;
        else if (op1<0) return -1;
        else res=Math.pow(op1, op2);
        return res;
    }
    /*double Root(double op1) {
        if (op1==0||op1==1) return op1;
        int i=1;
        double res=1;
        while (res<=op1) {
            i++;
            res=i*i;
        }
        return i-1;
    }*/
    double NthRoot(double op1, double op2) {
        double res=1;
        if (op1==0||op1==1) return op1;
        else if(op1<0) return -1;
        else {
            res=Math.pow(op1, 1/op2);
        }
        return res;
    }

}

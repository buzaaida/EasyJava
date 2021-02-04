package com.company;

public class Main2nd {
    public static void main(String[] args) {
        int k=0;
        while (k<=10) {
            if (k==5) /*continue;*/ break;
            //Beskonacna petlja se desila zbog continue. Print se preskace kada je k=5 sto je konstantno nakon 5. prolaza jer k se ne moze povecati prije print.
            System.out.print(++k+" ");
        }
    }
}

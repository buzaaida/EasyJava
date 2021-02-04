package com.company;

public class Main3rd {
    public static void main(String[] args) {
        int k=0;
        while (k<=10) {
            if (k++==5) continue;
            //6 ne ispisuje zbog continue, preskace print i prelazi na 7, a 11 je ispisano jer se k uvecava naknadno.
            System.out.print(k+" ");
        }
    }
}

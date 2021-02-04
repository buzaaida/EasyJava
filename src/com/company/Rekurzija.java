package com.company;

public class Rekurzija {
    public static void main(String[] args) {
        fun(7);
    }
    public static void fun(int param) {
        System.out.println("Usli smo u fju sa parametrom "+param);
        /*
        sve dok je parametar manji od 10 blok if-a ce se izvrsiti pa ce za
        ulazak sa 7 ispisati "Usli... 7", "kraj 8", za
        ulazak sa 8 ispisati "Usli... 8", "kraj 9", za
        ulazak sa 9 ispisati "Usli... 9", "kraj 10", za
         */
        if (param<10) /* base condition*/ {
            param++; //povecavanje parametra
            fun(param); //recursive call
        }
        /*
        kada parametar postane 10 base condition nije vise ispunjena pa se if ne izvrsava i odmah se ispisuje "kraj 10",
        zato je "kraj 10" ispisano dva puta
         */
        System.out.println("Kraj "+param);
    }
}

package com.company;

public class PrenosArgumenata {
    public static void main(String[] args) {
        int a=7;
        povecaj(a);
        System.out.println("poslije poziva funkcije a="+a);
        Objekat o=new Objekat(7);
        povecaj(o);
        System.out.println("poslije poziva funkcije o.a="+o.a);
    }
    public static void povecaj(Objekat o) {
        o.a++;
        System.out.println("lokalno o.a="+o.a);
    }

    /*
    slozeni tipovi se prenose u funkcije by reference tako da se izmjene koje se desavaju unutar funkcija
    desavaju i nad varijablama van funkcija, i lokalna varijabla o.a u funkciji kao i varijavla o.a u main-u
    imaju jednaku (uvecanu) vrijednost 8
     */

    public static void povecaj(int a) {
        a++;
        System.out.println("lokalno a="+a);
    }
    /*
    primitivni tipovi se prenose u funkcije by value tako da izmjene koje se dese nad varijablom
    egzistiraju samo unutar funkcije kao i same varijable pa je lokalno a iz funkcije (povecaj) 8, a poslije
    poziva funkcije a (iz main-a) i dalje 7
     */
}

package com.company;

public abstract class Humans {
    int age;
    int id_num;
    String profession;
    String nationality;
    String race;
    public Humans (int age, int id_num, String profession, String nationality, String race) {
        this.age=age;
        this.id_num=id_num;
        this.profession=profession;
        this.nationality=nationality;
        this.race=race;
    }
}

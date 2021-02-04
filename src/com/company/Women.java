package com.company;

public class Women extends Humans {
    String gender="female";
    public Women(int age, int id_num, String profession, String nationality, String race) {
        super(age, id_num, profession, nationality, race);
    }
    @Override
    public String toString() {
        return "\ndetails: "+"gender: "+gender+"   "+"age: "+this.age+"   "+"id: "+this.id_num+"   "+"profession: "+this.profession+"   "+"nationality: "+this.nationality+"   "+"race: "+this.race;
    }
}

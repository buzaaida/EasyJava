package com.company;

import java.util.ArrayList;

public class MainHumans {
    public static void main(String[] args) {
        Men m1=new Men(21, 10000, "profession1", "nationality1", "race1");
        Men m2=new Men(22, 20000, "profession2", "nationality2", "race2");
        Men m3=new Men(23, 30000, "profession3", "nationality3", "race3");
        Women w1=new Women(24, 40000, "profession4", "nationality4", "race4");
        Women w2=new Women(25, 50000, "profession5", "nationality5", "race5");
        ArrayList<Humans> humans=new ArrayList<Humans>(5);
        humans.add(m1);
        humans.add(m2);
        humans.add(m3);
        humans.add(w1);
        humans.add(w2);
        System.out.println("list of humans: "+humans.toString());
        ArrayList<Men> men=new ArrayList<Men>();
        ArrayList<Women> women=new ArrayList<Women>();
        boolean male=false;
        boolean female=false;
        for (int i=0; i<humans.size(); i++) {
            if (humans.get(i) instanceof Men) {
                male=true;
            } else if (humans.get(i) instanceof Women) {
                female=true;
            }
        }
        if (male) {
            men.add(m1);
            men.add(m2);
            men.add(m3);
            humans.remove(m1);
            humans.remove(m2);
            humans.remove(m3);
        }
        if (female) {
            women.add(w1);
            women.add(w2);
            humans.remove(w1);
            humans.remove(w2);
        }
        System.out.println("\n");
        System.out.println("list of men: "+men.toString());
        System.out.println();
        System.out.println("list of women: "+women.toString());
        System.out.println("\n");
        System.out.println("now empty list of humans: "+humans.toString());
    }
}

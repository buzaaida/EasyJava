package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Language {
    public static void main(String[] args) {
        HashMap<String, String> languages=new HashMap<String, String>();
        languages.put("it", "Benvenuti!");
        languages.put("ger", "Willkommen!");
        languages.put("eng", "Welcome!");
        System.out.println("Choose language: ");
        Scanner scanner=new Scanner(System.in);
        String language=scanner.next();
        languages.forEach ((k,v)-> {
            if (language.equals(k)) {
                System.out.println(v);
            } else if (language.equals(k)) {
                System.out.println(v);
            }else if (language.equals(k)) {
                System.out.println(v);
            }
        });
    }
}

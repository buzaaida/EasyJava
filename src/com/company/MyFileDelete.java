package com.company;

import java.io.File;

public class MyFileDelete {
    public static void main(String[] args) {
        File my_file=new File("");
        if (my_file.delete()) {
            System.out.println("File deleted.");
        } else {
            System.out.println("Error!");
        }
    }
}

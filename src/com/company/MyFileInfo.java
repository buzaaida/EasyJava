package com.company;

import java.io.File;

public class MyFileInfo {
    public static void main(String[] args) {
        File my_file=new File("cherryberry.txt");
        if (my_file.exists()) {
            System.out.println("file info");
            System.out.println("---------");
            System.out.println("name: "+my_file.getName());
            System.out.println("absolute path: "+my_file.getAbsolutePath());
            System.out.println("readable: "+my_file.canRead());
            System.out.println("writable: "+my_file.canWrite());
            System.out.println("size in bytes: "+my_file.length());
            System.out.println("last modified: "+my_file.lastModified());
            System.out.println("hash code: "+my_file.hashCode());
        } else {
            System.out.println("File does not exist.");
        }
    }
}

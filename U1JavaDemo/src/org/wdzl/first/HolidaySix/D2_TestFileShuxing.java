package org.wdzl.first.HolidaySix;

import java.io.File;

public class D2_TestFileShuxing {
    public static void main(String[] args) {
        //1
        File f = new File("F:\\stu.txt");
        String name = null;
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(name = f.getPath());
        System.out.println(name = f.getAbsolutePath());
        System.out.println(name = f.getName());
        System.out.println(f.length());
    }
}

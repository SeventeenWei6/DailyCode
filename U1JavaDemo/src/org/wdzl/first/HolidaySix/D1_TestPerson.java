package org.wdzl.first.HolidaySix;

import java.io.*;

public class D1_TestPerson {
    public static void main(String[] args)throws IOException, FileNotFoundException,ClassNotFoundException {
//        File f = new File("F:\\stu.txt");
//        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(f));
//        os.writeObject(new D1_PersonXuliehua("张三",20));
//        os.close();/*  */

        File f = new File("F:\\stu.txt");
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream(f));
        Object o = oi.readObject();
        System.out.println(o);
        oi.close();
    }
}

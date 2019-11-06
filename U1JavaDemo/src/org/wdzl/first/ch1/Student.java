package org.wdzl.first.ch1;

public class Student {
    int id;
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.id = 8349;
        int x = stu1.id%10;
        int y = (stu1.id%100)/10;
        int z = (stu1.id%1000)/100;
        int o = stu1.id/1000;
        int sum = x+y+z+o;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(o);
        System.out.println(sum);


    }
}

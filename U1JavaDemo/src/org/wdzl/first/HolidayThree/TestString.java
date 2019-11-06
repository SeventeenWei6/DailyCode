package org.wdzl.first.HolidayThree;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
//        String a = new String("aaa");
//        String b = new String("aaa");
//        System.out.println(a==b);
//        String name ;
//        Scanner input  = new Scanner(System.in);
//        name = input.next();
//        System.out.println(name.equals("zhangsan"));
//        System.out.println("zhangsan".equals(name));
//        String a = "av  c  ";
//        a.trim();
//        System.out.println(a);
        String s = "今天";
        s = s+"是一个晴天";
        StringBuffer ss = new StringBuffer("haha");
        ss = ss.insert(5,"黑");
        System.out.println(ss);
    }
}

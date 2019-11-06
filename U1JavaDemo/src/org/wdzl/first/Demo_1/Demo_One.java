package org.wdzl.first.Demo_1;

import java.util.Scanner;

public class Demo_One {
    public static void main(String[] args) {
        oneTest temp = new twoTest();
        System.out.println(temp.book);
        temp.test();
        temp.one();
    }
}
class oneTest{
    public  int book = 6;
    public void one()
    {
        System.out.println("父亲的普通方法");
    }
    public void test()
    {
        System.out.println("被覆盖的方法");
    }
}
class twoTest extends oneTest{
    public int book = 7;
    public void two()
    {
        System.out.println("儿子的普通方法");
    }
    public void test()
    {
        System.out.println("子类覆盖父类的方法");
    }
}


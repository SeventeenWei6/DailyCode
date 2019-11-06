package org.wdzl.first.HolidaySeven;

import org.wdzl.first.HolidayFour.Demo;

import java.io.IOException;

public class Demo_1_TestThread {
    public static void main(String[] args)throws InterruptedException {
        //创建对象
        System.out.println(Thread.currentThread().getName()+" start");
     Demo_1_Thread t1 = new Demo_1_Thread("A");
     Demo_1_Thread t2 = new Demo_1_Thread("B");
     Demo_1_Thread t3 = new Demo_1_Thread("C");
        System.out.println("t1Start:");
        t1.start();
        System.out.println("t2End:");
        System.out.println("t2Start:");
        t2.start();
        System.out.println("t2End");
        t1.join();
        System.out.println("t3Start");
        t3.start();
        System.out.println("t3End");
        System.out.println(Thread.currentThread().getName()+" End");

    }
}

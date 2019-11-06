package org.wdzl.first.HolidaySeven;

import java.text.SimpleDateFormat;
import java.util.Date;

public class D1_TestSleep {
    public static void main(String[] args)throws  InterruptedException {
        D1_ThreadSleep s1 = new D1_ThreadSleep();
//        D1_ThreadSleep s2 = new D1_ThreadSleep();
        s1.setName("top1");
//        s2.setName("top2");
        s1.start();
        System.out.println(new SimpleDateFormat("2 "+"yyyy年mm月dd日 hh:mm:ss").format(new Date()));
        Thread.sleep(7000);
        System.out.println(new SimpleDateFormat("3 "+"yyyy年mm月dd日 hh:mm:ss").format(new Date()));
        //s1.interrupt();
    }
}

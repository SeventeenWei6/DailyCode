package org.wdzl.first.HolidaySeven;

import java.text.SimpleDateFormat;
import java.util.Date;

public class D1_ThreadSleep extends Thread {
    @Override
    public void run() {


            //休眠
            try {
                System.out.println(new SimpleDateFormat("1 "+"yyyy年mm月dd日 hh:mm:ss").format(new Date()));
                Thread.sleep(6000);
                System.out.println(getName()+":"+new SimpleDateFormat("yyyy年mm月dd日 hh:mm:ss").format(new Date()));
            }catch (InterruptedException e)
            {
                System.out.println("线程终止");
            }
            System.out.println("isover");
        }
    }
